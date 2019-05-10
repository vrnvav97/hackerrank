import java.util.*;
class PickingNumbers
{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n;++i)
			a[i] = sc.nextInt();



		int max = -1;
		List<Integer> al = new ArrayList<>();
		for (int i=0;i<n;++i)
		{
			
			al.add(a[i]);
			
			for (int j=0;j<n;++j)
			{	
				
				if (j!=i)
				{
					
					boolean f = false;
					for (int k =0;k<al.size();++k)
					{	
						if (Math.abs(a[j]-al.get(k))<=1)
						{
							f = true;
						}
						else
						{
							f = false;
							break;
						}
					}
					if (f)	
						al.add(a[j]);
				}
			}
			if (al.size()>max)
				max = al.size();
			al.clear();
		}
		System.out.println (max);
	}
}
