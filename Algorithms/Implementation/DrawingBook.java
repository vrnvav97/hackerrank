import java.util.*;
class DrawingBook
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		if (n%2==0)
		{//even
			if ((p-1)<(n-p))
			{
				System.out.println ((int)Math.ceil((p-1)/2.0));
			}
			else
			{	
				if (p%2==0)
				{//even
					System.out.println ((n-p)/2);
				}
				else
				{//odd
					System.out.println ((int)((n-p)/2)+1);
				}
			}
		}
		else
		{//odd
			if ((p-1)<(n-p))
			{
				System.out.println ((int)Math.ceil((p-1)/2.0));
			}
			else
				System.out.println ((int)((n-p)/2));
		}
	}
}
