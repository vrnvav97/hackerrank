import java.util.*;
class LetsReview
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while (T>0)
		{
			String s = sc.nextLine();
			String even="";
			String odd="";
			for (int i=0;i<s.length();++i)
			{
				if (i%2==0)
					even += s.charAt(i);
				else
					odd += s.charAt(i);
			}
			System.out.println (even + " " + odd);
			T--;
		}
	}
}