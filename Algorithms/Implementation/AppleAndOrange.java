import java.util.*;
class AppleAndOrange
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int s, t , a, b,m,n;
		s = sc.nextInt();
		t = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		m = sc.nextInt();
		n = sc.nextInt();

		int mArray[] = new int [m];
		int nArray[] = new int [n];
		for (int i=0;i<m;++i)
			mArray[i] = sc.nextInt();
		for (int i=0;i<n;++i)
			nArray[i] = sc.nextInt();
		


		for (int i=0;i<m;++i)
		{
			mArray[i] += a;
		}
		
		for (int i=0;i<n;++i)
		{
			nArray[i] += b;
		}

		int count = 0;
		for (int i:mArray)
			if (i>=s && i<= t)
				count++;
		System.out.println (count);
		count = 0;
		for (int i:nArray)
			if (i>=s && i<= t)
				count++;
		System.out.println (count);
	}
}