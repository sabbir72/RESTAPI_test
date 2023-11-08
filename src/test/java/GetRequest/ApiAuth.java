package GetRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ApiAuth {
   @Test
	public void Auth () {
		int code=RestAssured.given()
				.auth().preemptive()
				.basic("postman", "password")   // status code show =  401 Unauthorized HTTP" if any wrong
				.when()
				.get("https://postman-echo.com/basic-auth/")
				.getStatusCode();
		
	   System.out.println("Code is:"+code);
	}
}
 