package practice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import data.Payload;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(Payload.addPlace())
		.when().post(" maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		
		.extract().response().asString();
		 
		
		
//		System.out.println(response);
		
		JsonPath js = new JsonPath(response);
		String place = js.getString("place_id");
		
//		UpdatePlaceAPI
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+place+"\",\r\n" + 
				"\"address\":\"5112 Summerhill Rd, USA\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
//		GetPlaceAPI
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", place).header("Content-Type", "application/json")
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).body("address", equalTo("5112 Summerhill Rd, USA"));
		
		
		
	}

}
