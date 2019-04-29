import java.util.*;
class BreakingTheRecords
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int scores[] = new int[sc.nextInt()];
		for (int i=0;i<scores.length;++i)
			scores[i] = sc.nextInt();
		int minScore = Integer.MAX_VALUE, maxScore = Integer.MIN_VALUE, minCount = 0, maxCount = 0;
		for (int i=0;i<scores.length;++i)
		{
			if (scores[i] < minScore)
			{
				minScore = scores[i];
				minCount++;
			}
			if (scores[i] > maxScore)
			{
				maxScore = scores[i];
				maxCount++;
			}
		}
		if (maxCount==0 || minCount==0)
		{
			if (maxCount==0 && minCount==0)
				System.out.println (maxCount + "\n" + minCount);
			else if (maxCount == 0)
				System.out.println (maxCount + "\n" + --minCount);
			else if (minCount == 0)
				System.out.println (--maxCount + "\n" + minCount);
		}
		else
		System.out.println (--maxCount + "\n" + --minCount);
	}
}