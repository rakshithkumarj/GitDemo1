package abstraction;

import java.util.HashSet;
import java.util.Set;

public class FindDupWordsInArray {

	public static void main(String[] args) {
		String[] words= {"java","selenium","testng","Selenium","java"};
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					System.out.println("Duplicate words are"+words[i]);
					Set<String> set= new HashSet<>();
					 for (String str : set) {
						 
						 if(set.add(str)==false)
						 {
							 System.out.println("duplicate word is"+str);
						 }
						
					}
				}
			}
		}
		
				
		}
  
	
	}


