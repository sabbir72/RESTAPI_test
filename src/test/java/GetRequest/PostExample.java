package GetRequest;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostExample {
	
	@Test
	public void testPost() {
		
		RequestSpecification  request = RestAssured.given();
		
		request.header("Content-Type", "application/json");
		
		JSONObject json=new JSONObject();
		
		json.put("id", "2");
		json.put("title", "PDA");
		json.put("author", "Sabbir ahamed");

		request.body(json.toJSONString());

		Response response= request.post("http://localhost:3000/posts");

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,201);


		
	}

}
