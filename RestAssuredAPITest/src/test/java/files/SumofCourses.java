package files;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class SumofCourses {

	public static void main(String[] args) {

		JsonPath js = new JsonPath(Payload.CoursePrice());
		int size = js.getInt("courses.size()");
		int sum = 0;

		for (int i = 0; i < size; i++) {
			int price = js.getInt("courses[" + i + "].price");
			int copies = js.getInt("courses[" + i + "].copies");
			int amount = price * copies;
			sum = sum + amount;

		}
		System.out.println(sum);
		int purchaseAmount=js.get("dashboard.purchaseAmount");
		Assert.assertEquals(sum, purchaseAmount);
	}

}
