package programs;

public class LeftRotate {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };

		// expected={20,30,40,50,10}

		int temp = array[0];
		for (int i = 1; i < array.length; i++) {
			array[i - 1] = array[i];
		}
		array[array.length - 1] = temp;
	
	
	for(int i:array)
	{
		System.out.println(i);
	}
	}
}
