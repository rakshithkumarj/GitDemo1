package octpractice;

import java.util.HashSet;
import java.util.Set;

public class DemoFindDup {

	public static void main(String[] args) {
		String str[]= {"rakshith","rakshi","Raks","rakshith","Karthik","rakshi"};
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println("Duplicate element is::" +str[i]);
				}
			}
		}
		
           System.out.println("***********************");
	
	Set<String> store=new HashSet<String>();
	for(String name:str)
	{
		if(store.add(name)==false)
		{
			System.out.println("Duplicate element is::" +name);
		}
	}

}}
