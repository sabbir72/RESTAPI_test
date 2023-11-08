package GetRequest;


import org.testng.Assert;
import org.testng.annotations.Test;
//import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteExample {
	
	@Test
	public void testDelete() {
		
		RequestSpecification  request = RestAssured.given();
		
		Response response= request.delete("http://localhost:3000/posts/12");
		
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);


		
	}

}
