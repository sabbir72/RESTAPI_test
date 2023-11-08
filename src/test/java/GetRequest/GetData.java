package GetRequest;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import java.sql.Time;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetData {

    @Test
    public void testResponse(){
    	
//    	RestAssured.
      Response rest = get("http://localhost:3000/posts/");
      
//       Status code 
        int code=rest.getStatusCode();
//      int code=get("https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b1b15e88fa797225412429c1c50c122a1").getStatusCode();
      System.out.println("status code is :"+code);
      Assert.assertEquals(code,200);
      

      
//       Show data 
       String data = rest.asString();
       System.out.println("Data is :"+data);

//     Show times 
     System.out.println("reposne Time :"+ rest.getTime());
    }
}
