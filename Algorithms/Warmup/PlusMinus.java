import java.util.StringTokenizer;
import java.io.*;
class pm
{ 
public static void main (String []p) throws 

Exception
{ int i;
BufferedReader br = new BufferedReader ( new 

InputStreamReader ( System.in)); 

int N = Integer.parseInt (br.readLine ());

int arr[] = new int [N];

String s = br.readLine ();
StringTokenizer st = new StringTokenizer (s);
i =0;
while (st.hasMoreTokens ())
{
arr[i] = Integer.parseInt (st.nextToken()); 
++i;
}
 
 double cp=0,cn=0,cz =0;
for (i=0 ;i<N;++i) 
{ 
if ( arr[i] > 0)
  ++cp;
if ( arr[i] < 0)
  ++cn;
if ( arr[i] == 0)
  ++cz; 
}
System.out.printf ("%.6f \n", cp/N);
System.out.printf ("%.6f \n", cn/N);
System.out.printf ("%.6f \n", cz/N);
} } 
