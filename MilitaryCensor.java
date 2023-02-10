import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.List;


/*
 * 2/10
 * Detect if military mail contains banned words
 * 
 */

public class MilitaryCensor {

	public static void main(String[] args) {
		
		String letter = "I hope i surive the ASSAULT tomorrow";
		StringTokenizer toBan = new StringTokenizer(letter, " ");
		Boolean reject = false;
		String[] bannedWords = new String[]{"hermes","bridge","muddy","river","assault","offensive"};
		
		List<String> list = Arrays.asList(bannedWords);
		
		
		while (toBan.hasMoreTokens()) 
		{
			if (list.contains(toBan.nextToken().toLowerCase())) 
			{
				System.out.println(letter + ">>>Rejected");
				reject = true;
				break;
			}
			
			
		}
		if (reject == false) {
			System.out.println(letter + ">>>OK");
		}
		
		
	}

}
