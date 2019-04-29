import java.util.*;
class MigratoryBirds
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int a[] = new int[5];
		int userInput[] = new int[n];
		for (int i=0;i<n;++i)
			userInput[i] = sc.nextInt();

		for (int i=0;i<n;++i)
		{
			a[userInput[i]-1]++;
		}

		

		int mainCount=a[0],id=1;
		//System.out.println ("value mainCount initially " + mainCount);
		for (int i=0;i<5;++i)
		{
			if (a[i] > mainCount)
			{
			//	System.out.println ("Value of mainCount changed " + mainCount);
				mainCount = a[i];
				id = i+1;
			}
		}
		System.out.println (id);
	}
}