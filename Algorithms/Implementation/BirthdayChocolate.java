import java.util.*;
class BirthdayChocolate
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int numberOnSquares[] = new int[n];
		for (int i=0;i<n;++i)
			numberOnSquares[i] = sc.nextInt();
		int birthDate, birthMonth;
		birthDate = sc.nextInt();
		birthMonth = sc.nextInt();
		int mainCount = 0;
		for (int i=0;i<n && (n-i)>=birthMonth;++i)
		{
			int j = i;
			int count = 0;
			int sum = 0;
			while (count < birthMonth)
			{
				//System.out.println ("Considering square " + numberOnSquares[j]);
				sum += numberOnSquares[j];
				count++;
				j++;
			}
			if (sum==birthDate)
				mainCount++;
		}
		System.out.println (mainCount);
	}
}