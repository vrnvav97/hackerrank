import java.util.*;
class SockMerchant
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i,j;
		int n =sc.nextInt ();
		int a[][] = new int[n][2];
		for (i=0;i<n;++i)
		{
			boolean flag = false;
			int userColor = sc.nextInt();
			for ( j=0;j<n;++j)
			{
				if (a[j][0]==userColor)
				{
					a[j][1]++;
					flag = true;
					break;
				}
				else if (a[j][0] == 0)
				{
					flag = false;
					break;
				}
			}
			if (flag == false)
			{
				a[j][0] = userColor;
				a[j][1]++;
			}
		}
		// System.out.println ("Array formed ");
		// for ( i=0;i<n;++i)
		// {
		// 	System.out.print (a[i][0] + " " + a[i][1]);
		// 	System.out.println ();
		// }
		int globalCount = 0;
		for ( i=0;i<n;++i)
		{
			if (a[i][0] != 0)
				globalCount += a[i][1]/2;
		}
		System.out.println (globalCount);
	}
}