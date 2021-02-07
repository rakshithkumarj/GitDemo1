package octpractice;

public class SortNumber {

	public static void main(String[] args) {
     int [] num= {2,5,4,23,45,23,1,7,9};
     int temp;
     for(int i=0;i<num.length;i++)
     {
    	 for(int j=i+1;j<num.length;j++)
    	 {
    		 if(num[i]<num[j])
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
