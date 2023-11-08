package GetRequest;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutExample {
	
	@Test
	public void testPut() {
		
		RequestSpecification  request = RestAssured.given();
		
		request.header("Content-Type", "application/json");
		
		JSONObject json=new JSONObject();
		
		json.put("id", "9");
		json.put("title", "PDL");
		json.put("author", "Mijan ahamed");

		request.body(json.toJSONString());

		Response response= request.put("http://localhost:3000/posts/10");

		int statusCode = response.getStatusCode();
		System.out.println("Check the code :" + statusCode);
		Assert.assertEquals(statusCode,200);


		
	}

}
