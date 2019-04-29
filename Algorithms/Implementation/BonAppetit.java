import java.util.*;
class BonAppetit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0;i<n;++i) {
			a[i] =sc.nextInt();
		}
		int b = sc.nextInt();

		int sum=0;
		for (int i=0;i<n;++i)
		{
			if (i==k)
				continue;
			else
				sum += a[i];
		}
		sum = sum/2;
		if (sum==b)
			System.out.println ("Bon Appetit");
		else
			System.out.println (b-sum);
	}
}