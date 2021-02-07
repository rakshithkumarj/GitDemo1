package octpractice;

public class RemoveSpecialCharacterfromString {

	public static void main(String[] args) {
		String str="9743ieuwghvfis637@#$%ABCNAhaiudfasfiuweriufqifhiuhdfiuhdsif";
		StringBuffer sb= new StringBuffer(str);
		char[] chars=str.toCharArray();
		for(int i=0;i<=sb.length()-1;i++)
		{
			if(sb.charAt(i)< 48 || sb.charAt(i)>57)
			{
				sb.deleteCharAt(i);
				i--;
			}
		}
   System.out.println(sb);
	}

}
