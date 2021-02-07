package octpractice;

public class DemoRearrange {

	public static void main(String[] args) {
	String s1="AbdcBDCa";
     char temp;
     char[] ch=s1.toCharArray();
     System.out.println(ch);
     for(int i=0;i<ch.length;i++)
     {
    	 for(int j=i+1;j<ch.length;j++)
  
     {
    	 if(ch[i]>ch[j])
    	 {
    		 temp=ch[i];
    		 ch[i]=ch[j];
    		 ch[j]=temp;
    	 }
     }
    	 System.out.print(ch[i]);
	}
    
}
}