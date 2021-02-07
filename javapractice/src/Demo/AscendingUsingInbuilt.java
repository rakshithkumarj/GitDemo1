package Demo;

import java.util.Arrays;
import java.util.Collections;

public class AscendingUsingInbuilt {

	public static void main(String[] args) {
		int [] num= {2,5,3,4,9,10,7,6,1};
		
		Arrays.sort(num);
	
	
		for(int i:num)
		{
			System.out.println(i);
		}

	}

}
