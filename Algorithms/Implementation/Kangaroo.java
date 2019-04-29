import java.util.*;
class Kangaroo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x1,v1,x2,v2;
		x1 = sc.nextInt();
		v1 = sc.nextInt();
		x2 = sc.nextInt();
		v2 = sc.nextInt();
		if (everMeet (x1,x2,v1,v2))
			System.out.println ("Yes");
		else
			System.out.println ("No");

	}
	
    static boolean everMeet(int x1, int x2, 
                            int v1, int v2) 
    { 

        // If speed of a person  
        // at a position before  
        // other person is smaller,  
        // then return false. 
        if (x1 < x2 && v1 < v2) 
        return false; 
        if (x1 > x2 && v1 > v2) 
        return false;  
          
        // Making sure that  
        // x1 is greater 
   
        if (x1 < x2) 
        { 
        	int c = x1;
        	x1 = x2;
        	x2 = c;
        	c = v1;
        	v1 = v2;
        	v2 = c;
        }  
      
        // Until one person  
        // crosses other 
       
        while (x1 >= x2)  
        { 
            if (x1 == x2)  
                return true; 
              
            // first person taking one 
            // jump in each iteration 
            x1 = x1 + v1;  
              
            // second person taking 
            // one jump in each iteration 
            x2 = x2 + v2;  
        } 
      
        return false;  
    }
}