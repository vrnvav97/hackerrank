import java.util.*;
class BetweenTwoSets
{
	static long hcf (long a, long b)
	{
		if (a>b)
		{
			 return hcf (b,a);
			
		}
		if (b%a==0)
			return a;
		else 
			return (hcf(b%a,a));
	}

	static long lcm (long a, long b)
	{
		return (a*b)/hcf(a,b);
	}

	static long lcmOfArray (int a[])
	{

		long ans = a[0];
		for (int i=1;i<a.length;++i)
			ans = lcm (ans,a[i]);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[] = new int [sc.nextInt()];
		//int b[] = new int [sc.nextInt()];
		
		for (int i=0;i<a.length;++i)
			a[i] = sc.nextInt();
		// for (int i=0;i<b.length;++i)
		// 	b[i] = sc.nextInt();


		long lcmAArray = lcmOfArray (a);
		System.out.println ("LCM Array-->" + lcmAArray);
		int count = 0 ;
		int k = 1;
		int n = lcmAArray;
		while (lcmAArray <= b[0])
		{
			//System.out.println ("Considering for " + lcmAArray);
		boolean flag = false;
		for (int i=0;i<b.length;++i)
		{
			if (b[i] % lcmAArray== 0)
				flag = true;
			else
			{
				flag = false;
				break;
			}
		}
		if (flag)
			count++;
		lcmAArray  = n * ++k;
	}
	System.out.println (count);

	}
}