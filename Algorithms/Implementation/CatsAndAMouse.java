import java.util.*;
class CatsAndAMouse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int queries = sc.nextInt();
		while (queries > 0)
		{
			int catA = sc.nextInt();
			int catB = sc.nextInt();
			int mouseC = sc.nextInt();
			if (Math.abs(catA-mouseC)<Math.abs(catB-mouseC))
				System.out.println ("Cat A");
			else if (Math.abs(catB-mouseC)<Math.abs(catA-mouseC))
				System.out.println("Cat B");
			else if (Math.abs(catA-mouseC)==Math.abs(catB-mouseC))
				System.out.println ("Mouse C");
			--queries;
		}
	}
}