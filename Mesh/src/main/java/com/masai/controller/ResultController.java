package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.service.UserService;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;

@RestController
public class ResultController {

	
	  @Value("${openai.api.chat.default.role}")
	  private String defaultRole;
	
	
	@Autowired
	private UserService userService;
	
	
	
	@PostMapping("/summary")
	public ResponseEntity<String> summaryGeneration(@RequestBody Promp pg)
	{


		System.out.println(pg.getPrompt()+" "+ pg.getLanguage());
		
		   String prompt = pg.getPromptValue("Summary");
		   
		  final OpenAiService service = userService.getOpenAiService();
	      final ChatCompletionRequest chatRequest = userService.getChatCompletionRequest(List.of(new ChatMessage(defaultRole, prompt)));
	     String s = service.createChatCompletion(chatRequest).getChoices().get(0).getMessage().getContent();
	    
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
	
	  @PostMapping("/generation")
	  public ResponseEntity<String> generateText(@RequestBody Promp pg)
		{
			System.out.println(pg.getPrompt()+" "+ pg.getLanguage());
			   String prompt = pg.getPromptValue("Generate");
			   
			  final OpenAiService service = userService.getOpenAiService();
		      final ChatCompletionRequest chatRequest = userService.getChatCompletionRequest(List.of(new ChatMessage(defaultRole, prompt)));
		     String s = service.createChatCompletion(chatRequest).getChoices().get(0).getMessage().getContent();
		    
			return new ResponseEntity<>(s,HttpStatus.OK);
		}
	
	  @PostMapping("/translation")
	  public ResponseEntity<String> languageTranslation(@RequestBody Promp pg)
		{
			System.out.println(pg.getPrompt()+" "+ pg.getLanguage());
			   String prompt = pg.getPromptValue("Translator");
			   
			  final OpenAiService service = userService.getOpenAiService();
		      final ChatCompletionRequest chatRequest = userService.getChatCompletionRequest(List.of(new ChatMessage(defaultRole, prompt)));
		     String s = service.createChatCompletion(chatRequest).getChoices().get(0).getMessage().getContent();
		    
			return new ResponseEntity<>(s,HttpStatus.OK);
		}
	

	
}
