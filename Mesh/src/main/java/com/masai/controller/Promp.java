package com.masai.controller;

public class Promp {

	
	private String prompt ;
	private String language;

	public Promp() {
		super();
	}
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	
	

	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Promp(String prompt,String language) {
		super();
		this.prompt = prompt;
		this.language = language;
	}

	public String getPromptValue(String catagory)
	{
		
		
		if(catagory.toLowerCase().equals("translator"))
		{
			return "Take the role of an expert teacher and have"
					+ " a knowledge of almost all the languages,"
					+ " you have the understanding to convert any text"
					+ " from one language to another language easily.\r\n"
					+ "\"\"Task\"\"\r\n"
					+ "know you have to convert the paragraph into"
					+ " the other language that is provided in the same formate\r\n"
					+ "Paragraph "+ prompt
					+" Language "+ language;
		}
		else if(catagory.toLowerCase().equals("Summary"))
		{
			return "Take the role of an expert teacher, you have the capability to "
					+ "explain any topic, You can summarize any paragraph to a"
					+ " human-like that text can be understandable even for a "
					+ "beginner of the language.\r\n"
					+ "\"\"Task\"\"\r\n"
					+ "know you have to summarize the paragraph "
					+ "in the \"step format\" around with"
					+ " one line in start about the paragraph "
					+ " in the given language\r\n"
					+ "Paragraph "+ prompt
					+" Language "+ language;
		}
		else
		{
			return "Take the role of an expert teacher,"
					+ " you have the capability to explain any topic,"
					+ " You can generate very human-like text around any "
					+ "case and that text can be understandable even for a "
					+ "beginner of the language.\r\n"
					+ "\"\"Task\"\"\r\n"
					+ "know you have to generate the text in 60-100"
					+ " works in the \"step format\" around a topic in"
					+ " the given language\r\n"
					+ "\"\"\"\r\n"
					+ "\"\"Example\"\"\r\n"
					+ "-Topic - What is Gen AI?\r\n"
					+ "-Language - English\r\n"
					+ "\"\"Output\"\"\r\n"
					+ "Gen AI refers to the next generation of artificial intelligence that combines advanced machine learning, deep neural networks, and human-like cognitive abilities for tasks like problem-solving and natural language understanding.\r\n"
					+ "\r\n"
					+ "Gen AI incorporates cutting-edge technology.\r\n"
					+ "It mimics human cognitive functions.\r\n"
					+ "Used for complex problem-solving.\r\n"
					+ "Understands and processes natural language.\r\n"
					+ "Promises significant advancements in AI.\r\n"
					+ "and so on\r\n"
					+ "\r\n"
					+ "-Topic What is Android?\r\n"
					+ "-Language - Hindi\r\n"
					+ "\r\n"
					+ "एंड्रॉयड एक मोबाइल ऑपरेटिंग सिस्टम है जिसे Google ने विकसित किया है। इसमें ऐप्स को चलाने के लिए होता है।\r\n"
					+ "\r\n"
					+ "1. गूगल द्वारा विकसित किया गया है।\r\n"
					+ "2. ऐप्स को चलाने के लिए होता है।\r\n"
					+ "3. ओपन सोर्स है।\r\n"
					+ "4. स्मार्टफोन और टैबलेट के लिए है।\r\n"
					+ "5. एंड्रॉयड स्टूडियो से ऐप्स विकसित होती हैं।\r\n"
					+ "6. यह दुनियाभर में पॉप्युलर है।\r\n"
					+ "7. customization की सुविधा है।\r\n"
					+ "8. ऐप स्टोर: Google Play Store।"
					+ "topic "+prompt+"\r\n"
					+"language "+language;
		}
			
			
			 
	}
	
	
}
