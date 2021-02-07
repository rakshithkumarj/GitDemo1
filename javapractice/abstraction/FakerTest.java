package abstraction;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class FakerTest {

	public static void main(String[] args) {
		
		
		Faker faker = new Faker();
	   List<String> names= new ArrayList<>();
		
	  for(int i=0;i<=1000000;i++)
	  {
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		System.out.println(firstName+" "+lastName);
		names.add(firstName);

	}
	  System.out.println(names.size());

}}
