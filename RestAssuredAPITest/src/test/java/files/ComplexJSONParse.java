package files;

import io.restassured.path.json.JsonPath;

public class ComplexJSONParse {

	public static void main(String[] args) {
		JsonPath js = new JsonPath(Payload.CoursePrice());
		int numberofCourses = js.getInt("courses.size()");
		System.out.println(numberofCourses);
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);

		// get first course title
		String firstCourseTitle = js.get("courses[0].title");
		System.out.println(firstCourseTitle);

		// print all the title

		for (int i = 0; i < numberofCourses; i++) {
			String title = js.get("courses[" + i + "].title");
			int pri = js.getInt("courses[" + i + "].price");
			System.out.println(title + "price is" + pri);
		}

		// print price if title is RPA

		for (int i = 0; i < numberofCourses; i++) {
			String title = js.get("courses[" + i + "].title");
			if (title.equalsIgnoreCase("rpa")) {
				int coursePrice = js.get("courses[" + i + "].price");
				int copiesSold = js.get("courses[" + i + "].copies");
				System.out.println("Price of RPA is" + copiesSold);
				break;

			}

		}

	}

}
