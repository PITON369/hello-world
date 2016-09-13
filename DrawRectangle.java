import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Draw rectangle
Key in the two numbers m and n.
Using a for loop to display a rectangle of size m by n of eights.
Example: m = 2, n = 4
8888
8888
*/

public class DrawRectangle
{
public static void print8(int k) {
for (int j=0; j<k; j++) {
System.out.print ("8");
}
}
public static void main(String[] args) throws Exception {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int m = Integer.parseInt(in.readLine());
int n = Integer.parseInt(in.readLine());
for (int i=0; i<m; i++) {
print8(n);
System.out.println("");
}
}
}
