package getrequest;





import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetData {
	@Test
	public void testResponsecode()
	{
	Response resp=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b1b15e88fa797225412429c1c50c122a1");
	int code=resp.getStatusCode();
	System.out.println(code);
	Assert.assertEquals(code, 200);
	}
	@Test
	public void testbody()
	{
		
		Response resp=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b1b15e88fa797225412429c1c50c122a1");
	String data=resp.asString();
	System.out.println(data);
	
	long time= resp.getTime();
	System.out.println(time);
	

	
	}
	@Test
	public void favebookapi()
	{
		Response resp=RestAssured.get("http://api.facebook.com/restserver.php");
		String data=resp.asString();
		System.out.println(data);
		
		long time= resp.getTime();
		System.out.println(time);
		
	}

}
