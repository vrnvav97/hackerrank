import java.util.*;
class CountingValleys
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int countSeaLevel = 0;
		boolean flag = false;
		int mainCount = 0;
		for (int i=0;i<s.length();++i)
		{
			if (s.charAt(i)=='U')
				countSeaLevel++;
			else if (s.charAt(i)=='D')
				countSeaLevel--;


			if (flag == false)
			{	//enter here only if you are above sea level
				if (countSeaLevel <0)
				{
					flag = true;
					mainCount ++;
				}
			}

			if (countSeaLevel >= 0 && flag ==true)
				flag = false;
		}
		System.out.println (mainCount);
	}
}