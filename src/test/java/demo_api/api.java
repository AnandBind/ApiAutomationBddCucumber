package demo_api;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class api {

	public static void main(String[] args) {

		String baseUri = "https://rahulshettyacademy.com";
		given().baseUri(baseUri).when().get("/Library/Addbook.php").then().assertThat().statusCode(200);
		
		//other Way

		RequestSpecification Req=given().baseUri(baseUri);
		Response Res=Req.when().get("/Library/Addbook.php");
		ValidatableResponse val=Res.then();
		val.assertThat().statusCode(200);
	}

}
