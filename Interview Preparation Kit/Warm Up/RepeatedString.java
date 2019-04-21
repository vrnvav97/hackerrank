import java.util.*;
class RepeatedString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		long n = sc.nextLong();
		long countA = 0;
		if (s.length() >= n)
		{
			for (int i=0;i<n;++i)
			{
				if (s.charAt(i)=='a')
					countA++;
			}
		}
		else
		{
			for (int i=0;i<s.length();++i)
			{
				if (s.charAt (i)=='a')
					countA++;
			}
				countA = n/s.length() * countA;
				long remaining = n- (n/s.length() * s.length());
				for (int i=0;i<remaining;++i)
				{
					if (s.charAt(i)=='a')
						countA++;
				}
		}
		System.out.println (countA);
	}
}