package Demo;

import java.util.ArrayList;
import java.util.List;

public class PrintEvenNumer {

	public static void main(String[] args) {
		/*int count = 0;*/
		List<Integer> li=  new ArrayList<Integer>();
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				li.add(i);
			/*	count++;*/
			}
		}
		/*System.out.println(count);*/
	System.out.println(	li.size());
	}

}
