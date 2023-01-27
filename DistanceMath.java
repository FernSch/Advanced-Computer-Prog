//this code is soooo bad T_T


import java.text.DecimalFormat;
import java.util.Scanner;


/*Distance math
uses distance formula to find distance between two points on a graph
1/26
*/
public class DistanceMath 
{

	public static void main(String[] args) 
	{
		// Scanner object to get input of points
		Scanner scan = new Scanner (System.in);
		//set format to 2 decimal places
		DecimalFormat fmt = new DecimalFormat ("0.##");
		
		
		//getting input of x and y coordinates for both points from a single string
		System.out.println("Enter both points seperated by a space (e.g 1,1 2,2): ");
		String points = scan.nextLine();	
		
		
		String[] splited = points.split("\\s+");
		//System.out.println(splited[0]);
		
		
		//converting points to integers from split string
		int x1 = Integer.parseInt(splited[0].split(",")[0]);
		int y1 = Integer.parseInt(splited[0].split(",")[1]);
		int x2 = Integer.parseInt(splited[1].split(",")[0]);
		int y2 = Integer.parseInt(splited[1].split(",")[1]);
		
		
		//calculating using distance formula
		double exes = Math.pow((x2 - x1), 2);
		double ys = Math.pow((y2 - y1), 2);
				
		System.out.println(fmt.format(Math.sqrt(exes + ys)));	
		
					
		

	}

}
