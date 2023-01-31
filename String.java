import java.util.Random;

/*
 	1/31
 	Strings
 	Show how to use all string operations
 */


public class Strings 
{

	public static void main(String[] args) 
	{
		//get charAat from a random value
		Random rand = new Random(); 
			
		int random_int = rand.nextInt(25);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char ch = alphabet.charAt(random_int);
		
		System.out.println(alphabet);
		System.out.println("01234567890123456789012345");
		System.out.println("alphabet.charAt(" + random_int + ") Is " + ch);
		
		System.out.println("+======================+\n");
	
		
		//use compare to compare difference of 2 strings
		System.out.println("ABC is " + "ABC".compareTo("CDE") + " Characters away from CDE");
		System.out.println("+======================+\n");
		
		//concat 2 strings
		System.out.println("abc.concat(DEF) is " + "ABC".concat("DEF"));
		System.out.println("+======================+\n");
		
		//check is strings are equal to each other
		System.out.println("abc.equals(ABC) is " + "abc".equals("ABC"));
		System.out.println("but abc.equalsIgnoreCase(ABC) is " + "abc".equalsIgnoreCase("ABC"));
		System.out.println("+======================+\n");
					
		//get index of string in larger string
		System.out.println(alphabet);
		System.out.println("01234567890123456789012345");
		System.out.println("HIJ has an index of " + alphabet.indexOf("HIJ"));
		System.out.println("+======================+\n");
		
		//get length of a string
		System.out.println("the length of " + alphabet);
		System.out.println("is " + alphabet.length());
		System.out.println("+=======================+\n");
		
		//replace every instance of a character in a string
		System.out.println("if i replace every instance of A in HHHHHAAAAAAHHHHH!!! with U");
		System.out.println("it becomes " + "HHHHHAAAAAAHHHHH!!!".replace("A", "U"));
		System.out.println("+==========================+\n");
		
		//get the range version of a substring
		System.out.println("the substring of " + alphabet + "from 0 to 5 is ");
		System.out.println(alphabet.substring(0, 5));
		System.out.println("+============================+\n");
		
		//get a substring
		System.out.println("the substring of " + alphabet + "from 5 to the end is");
		System.out.println(alphabet.substring(5));
		System.out.println("+============================+\n");
		
		//convert from lower to upper and upper to lower
		System.out.println("AHHHHHH!!!!! in lowercase is " + "AHHHHHH!!!!!".toLowerCase());
		System.out.println("and ahhhhhh!!!!! in uppercase is " + "ahhhhhh!!!!!".toUpperCase());
		
		

	}

}
