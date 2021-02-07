package programs;

public class AscendigOrder {

	public static void main(String[] args) {
	 int [] num= {2,5,3,6,4,1,9,7,10,};
	 int temp;
	 for(int i=0;i<num.length;i++)
	 {
		 for(int j=i+1;j<num.length;j++)
		 {
			 if(num[i]>num[j])
			 {
				 temp=num[i];
				 num[i]=num[j];
				 num[j]=temp;
			 }
		 }
		 System.out.println(num[i]);
	 }

	}

}
