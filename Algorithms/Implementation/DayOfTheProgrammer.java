import java.util.*;
class DayOfTheProgrammer
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int year = sc.nextInt();
		if (year >= 1700 && year <= 1917)
		{//julian calendar
			if (year % 4 == 0)
			{//leap year
				System.out.println ("12.09."+year);
			}
			else {
				//non leap year
				System.out.println ("13.09"+year);
			}
		}
		else if (year >= 1919)
		{//gregorian calendar
			if ((year%400==0) ||(( year % 4 == 0) && (year % 100 != 0)))
			{
				//leap year
				System.out.println ("12.09."+year);
			}
			else
			{
				//non leap year
				System.out.println("13.09."+year);
			}
		}
		else
		{//1918 year
			System.out.println ("27.09.1918");
		}
	}
}