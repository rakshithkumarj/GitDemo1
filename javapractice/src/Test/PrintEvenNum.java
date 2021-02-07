package Test;

import java.util.ArrayList;
import java.util.List;

public class PrintEvenNum {

	public static void main(String[] args) {
		int count = 0;
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				count++;
				li.add(i);

			}
		}
		System.out.println(li.size());
		System.out.println("total number of count is::"+count);
	}
}
