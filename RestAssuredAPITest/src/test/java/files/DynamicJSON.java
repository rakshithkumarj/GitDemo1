package files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJSON {

	@Test(dataProvider = "Bookdata")
	public void addBook(String isbn, String aisle) {
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type", "application/json")
				.body(Payload.addBook(isbn, aisle)).when().post("Library/Addbook.php").then().log().all().assertThat()
				.statusCode(200).extract().response().asString();

		System.out.println("response body is=" + response);

		JsonPath js = ReusableMethods.rawToJSON(response);
		String messge = js.getString("Msg");
		int id = js.getInt("ID");
		System.out.println(messge + id);

	}

	@DataProvider(name = "Bookdata")
	public Object[][] getData() {
		return new Object[][] { { "bfg", "234" }, { "bvg", "456" }, { "dfg", "789" } };
	}
	
	
	@DataProvider(name="UserCredentials")
			public Object[] getLoginData()
			{

			return new Object[]{"url","un","pw"};
			}
}
