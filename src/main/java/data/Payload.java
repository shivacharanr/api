package data;

public class Payload {	
	
	public static String addPlace(){
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -50,\r\n" + 
				"    \"lng\": 50\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Prestige cyber tower\",\r\n" + 
				"  \"phone_number\": \"(+91) 789 456 1233\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}";
	}
	
	public static String completeCoursePrice(){
		return "{\r\n" + 
				"\r\n" + 
				"\"dashboard\": {\r\n" + 
				"\r\n" + 
				"\"purchaseAmount\": 910,\r\n" + 
				"\r\n" + 
				"\"website\": \"rahulshettyacademy.com\"\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"\"courses\": [\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Selenium Python\",\r\n" + 
				"\r\n" + 
				"\"price\": 50,\r\n" + 
				"\r\n" + 
				"\"copies\": 6\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Cypress\",\r\n" + 
				"\r\n" + 
				"\"price\": 40,\r\n" + 
				"\r\n" + 
				"\"copies\": 4\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"RPA\",\r\n" + 
				"\r\n" + 
				"\"price\": 45,\r\n" + 
				"\r\n" + 
				"\"copies\": 10\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"]\r\n" + 
				"\r\n" + 
				"}";
		
	}

}
