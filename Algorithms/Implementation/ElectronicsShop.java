import java.util.*;
class ElectronicsShop
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int budget = sc.nextInt();
		int numberOfKeyboard = sc.nextInt();
		int numberOfDrives = sc.nextInt();
		int priceKeyboard[] = new int[numberOfKeyboard];
		int priceDrive[] = new int[numberOfDrives];
		for (int i=0;i<numberOfKeyboard;++i)
			priceKeyboard[i] = sc.nextInt();
		for (int i=0;i<numberOfDrives;++i)
			priceDrive[i] = sc.nextInt();
		int maxPrice = -1;
		int sum = -1;
		for (int i=0;i<numberOfKeyboard;++i)
		{
			for (int j=0;j<numberOfDrives;++j)
			{
				if ((priceDrive[j] + priceKeyboard[i]) <= budget)
					sum = priceDrive[j] + priceKeyboard[i];
				if (sum > maxPrice)
					maxPrice = sum;
			}
		}
		System.out.println (maxPrice);
	}
}