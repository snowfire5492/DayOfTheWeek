//*****************************************************************************/
//*****************************************************************************/
//
//
//      file: DayOfWeek.java
//      author: E. Schenck
//      class: CS 141 Intro to Programming 
//
//      assignment: ICA 8-2B
//      date last modified: 1/23/2017
//
//      purpose: Write the entire code for an program which contains an 
//		enumeration that represents the days of the week. When running 
//      your program it should display a list of the days to the user,
//      then prompt them to select a day. Display business hours for the 
//      chosen day. Assume that the business is open from 11 to 5 on Sunday,
//      9 to 9 on weekdays, and 10 to 6 on Saturday. Save and turn in your 
//      file as DayOfWeek.java to Blackboard.
//
//
//*****************************************************************************/
//*****************************************************************************/
 
 
 import java.util.Scanner;
 
 public class DayOfWeek
 {
	public enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, DEFAULT };
	
	public static void main(String[] args)
	{
		String userInput;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println(Day.MONDAY);
		System.out.println(Day.TUESDAY);
		System.out.println(Day.WEDNESDAY);
		System.out.println(Day.THURSDAY);
		System.out.println(Day.FRIDAY);
		System.out.println(Day.SATURDAY);
		System.out.println(Day.SUNDAY);
		System.out.print("\nPlease choose a day by typing the day as listed: ");
		
		userInput = keyboard.nextLine();
		Day userDay = Day.DEFAULT; // initializing userDay to DEFAULT, 
		try{
			userDay = Day.valueOf(userInput.toUpperCase());
		} catch (Exception e)	{}
				
		switch(userDay)
		{
			case MONDAY:
				System.out.println("MONDAY HOURS: 9am to 9pm");
				break;
			case TUESDAY:
				System.out.println("TUESDAY HOURS: 9am to 9pm");
				break;
			case WEDNESDAY:
				System.out.println("WEDNESDAY HOURS: 9am to 9pm");
				break;
			case THURSDAY:
				System.out.println("THURSDAY HOURS: 9am to 9pm");
				break;
			case FRIDAY:
				System.out.println("FRIDAY HOURS: 9am to 9pm");
				break;
			case SATURDAY:
				System.out.println("SATURDAY HOURS: 10am to 6pm");
				break;
			case SUNDAY:
				System.out.println("SUNDAY HOURS: 11am to 5pm");
				break;
			default:
				System.out.println("WRONG ENTRY");
				break;
		}
		
		
	
		
	}
 
 }