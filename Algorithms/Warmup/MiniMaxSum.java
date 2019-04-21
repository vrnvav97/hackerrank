import java.util.*;
class MiniMaxSum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[] = new int[5];
		int b[] = new int[4];
		int c[] = new int[4];
		for (int i=0;i<5;++i)
			a[i] = sc.nextInt();
		long minSum=0,maxSum=0;
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		int indexOne=0,indexTwo=0;

		for (int i=0;i<4;++i)
		{
			b[i] = a[i];
			c[i] = a[i];
			if (a[i] > max)
			{
				max = a[i];
				indexOne = i;
			}
			if (a[i] < min)
			{
				min = a[i];
				indexTwo = i;
			}
		}
		if (a[4] < max)
			b[indexOne] = a[4];
		if (a[4] > min)
			c[indexTwo] = a[4];


		for (int i:b)
		{
			minSum += i;
		}
		for (int i:c)
			maxSum += i;
		System.out.println (minSum + " " + maxSum);

	}
}


// import java.util.*;
// class MiniMaxSum
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner (System.in);
// 		long a[] = new long[5];
// 		long minSum =0 ,maxSum = 0;
// 		for (int i=0;i<5;++i)
// 			a[i] = sc.nextInt();
// 		PriorityQueue <Long> minPriorityQ = new PriorityQueue<>();
// 		PriorityQueue <Long> maxPriorityQ = new PriorityQueue<>(4,Collections.reverseOrder());
// 		for (long i:a)
// 			minPriorityQ.add(i);
// 		for (long i:a)
// 			maxPriorityQ.add(i);
// 		for (int i=0;i<4;++i)
// 			minSum += minPriorityQ.poll();
// 		for (int i=0;i<4;++i)
// 			maxSum += maxPriorityQ.poll();
// 		System.out.println (minSum + " " + maxSum);
// 	}
// }