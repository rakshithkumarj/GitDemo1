package octpractice;

public class FindDuplicateStringUsingForloop {

	public static void main(String[] args) {
	 String[] names= {"Java","Selenium","Testing","Pearl","Python","Java"};
	 System.out.println(names.length);
	 for(int i=0;i<names.length;i++)
	 {
		 for(int j=i+1;j<names.length;j++)
		 {
			 if(names[i]==names[j])
			 {
				 System.out.println("Duplicate name is::"+names[i]);
			 }
		 }
		
	 }
	 

	}

}
