import java.io.*;
class staircase
{ 
public static void main (String []p) throws 

Exception
{ 
BufferedReader br = new BufferedReader (new 

InputStreamReader ( System.in));

int n = Integer.parseInt (br.readLine());
 int count =0;
for ( int i =n;i>0;i--)
{ 
for (int k=0;k<i-1;k++)
System.out.print (" ");

for ( int j=0;j<=count;j++)
System.out.print ("#");
System.out.println ();
count ++;
} } }