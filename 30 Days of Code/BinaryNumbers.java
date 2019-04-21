import java.util.*;
class BinaryNumbers
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String binaryString = Integer.toBinaryString(n);
		System.out.println (binaryString);
		int universalCount = Integer.MIN_VALUE;
		for (int i=0;i<binaryString.length()-1;++i)
		{
			int count = 0;
			if (binaryString.charAt(i)=='1')
			{	
					count++;
				for (int j=i+1;j<binaryString.length();++j)
				{
					if (binaryString.charAt(j)=='1')
						count++;
					else
						break;
				}
				if (count > universalCount)
				universalCount = count;
			count = 0;

			}
			

		}
		System.out.println ("Number of consecutive 1s " + universalCount);
	}
}