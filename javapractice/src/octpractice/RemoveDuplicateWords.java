package octpractice;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String[] words= {"java","pearl","python","java","selenium","testng","selenium"};
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i]==words[j])
				{
					System.out.println(words[i]);
				}
			}
		}
	}
}
