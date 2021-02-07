import java.util.ArrayList;
import java.util.List;

public class ArraylistToArray {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("a");
		li.add("e");
		li.add("i");
		li.add("0");
		li.add("u");

		Object[] str = li.toArray();
		for (String s : li) {
			System.out.println(s);
		}

	}

}
