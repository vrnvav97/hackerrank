import java.util.*;
class 2DArrays
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[][] = new int[6][6];
		
		//input of array
		for (int i=0;i<6;++i)
		{
			for (int j=0;j<6;++j)
				a[i][j] = sc.nextInt();
		}

		int globalSum = Integer.MIN_VALUE;
		//taking out sum
		for (int i=0;i<4;++i)
		{
			for (int j=0;j<4;++j)
			{
				int sum = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2]
				if (sum > globalSum)
					globalSum = sum;
			}
		}	
		System.out.println (globalSum);
	}
}