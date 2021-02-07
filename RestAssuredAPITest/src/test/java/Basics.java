import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.Payload;
import files.ReusableMethods;

public class Basics {

	public static void main(String[] args) throws IOException {

		String newAddress = "SAN Fransisco California, USA";
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Rakshith.Jeppu\\Desktop\\addplace.json"))))
				.when().post("maps/api/place/add/json").then()/* .log().all() */.assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("server", "Apache/2.4.18 (Ubuntu)").extract().response()
				.asString();
		System.out.println("response body is:: " + response);

		// to fetch the place id
		JsonPath js = ReusableMethods.rawToJSON(response);
		String placeID = js.getString("place_id");
		System.out.println("Place id is= " + placeID);

		// Update place
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeID + ",\r\n" + "\"address\":\"" + newAddress + ",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}")
				.when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200);

		// get place
		String res = given().queryParam("key", "qaclick123").queryParam("place_id", "df4ad70fd04f52e9318f875dd8d493db")
				.when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract()
				.response().asString();
		JsonPath jsn = ReusableMethods.rawToJSON(res);
		String updatedAdd = jsn.getString("address");
		System.out.println("updated address is= " + updatedAdd);
		Assert.assertEquals(updatedAdd, newAddress);

	}

}
