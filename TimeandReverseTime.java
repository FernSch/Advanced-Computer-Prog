import java.util.Scanner;

/* 
 1/27
 James Schoenberg
 Time and Reverse Time
 Convert hours, minutes, seconds into seconds
 and convert seconds into hours, minutes seconds
  */

public class TimeAndReverseTime 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter time in seconds to convert: ");
		
		int seconds = scan.nextInt();
		
		int minutes = seconds / 60; 
		int Minutesremainder = seconds % 60;
		//System.out.println(minutes);
		int hours = minutes / 60;
		int Hoursremainder = minutes % 60;
		
		System.out.println(seconds + " in seconds in h,m,s is:");
		System.out.println(hours + " h " + Hoursremainder + "m " + Minutesremainder + "s");
		
		System.out.println("Enter hours to convert: ");
		int HourstoSeconds = scan.nextInt();
		
		System.out.println("Enter minutes to convert: ");
		int MinutestoSeconds = scan.nextInt();
		
		System.out.println("Enter seconds to convert: ");
		int SecondstoSeconds = scan.nextInt();
		
		HourstoSeconds *= 60;
		HourstoSeconds *= 60;
		MinutestoSeconds *= 60;
		
		int total = HourstoSeconds + MinutestoSeconds + SecondstoSeconds;
		
		System.out.println("That in seconds is: " + total);
		
		
	}
}
