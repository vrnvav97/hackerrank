import java.util.*;
class DivisibleSumPairs
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[] = new int [sc.nextInt()];
		int k = sc.nextInt();
		for (int i=0;i<a.length;++i)
			a[i] = sc.nextInt();
		int count=0;
		for (int i=0;i<a.length-1;++i)
		{
			for (int j=i+1;j<a.length;++j)
			{
				if ((a[i]+a[j])%k==0)
					count++;
			}
		}
		System.out.println (count);
	}
}