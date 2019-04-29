import java.util.*;
class GradingStudents
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		while (n-->0)
		{
			int marks = sc.nextInt();
			if (marks < 38)
			{
				System.out.println (marks);
				continue;
			}
			double quotient = marks/5.0;
			int nextMultiple = 5*(int)Math.ceil(quotient);
			if (nextMultiple-marks < 3 && nextMultiple-marks > 0)
				System.out.println (nextMultiple);
			else
				System.out.println (marks);
		}
	}
}