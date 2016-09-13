/* Multiplication table
Display the multiplication table of 10 to 10 as follows:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
public static void mnoz (int f) { 
for (int t=1; t<f+1; t++) { 
int r=t; int m=0;
for (int i=0; i<10; i++) { 
m=r+r*i;
System.out.print (m+" "); }
System.out.println ("");
}
}

public static void main(String[] args)
{
{
mnoz (10);
}
}
}
