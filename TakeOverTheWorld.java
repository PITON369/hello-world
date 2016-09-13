/* Take over the world
Key in the number and name display line:
"Name" take over the world through the "number" years. Mu-ha-ha!
Example: Bob take over the world in 8 years. Mu-ha-ha!
*/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeOverTheWorld {
public static void main(String[] args) throws Exception {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int y = Integer.parseInt(in.readLine());
String name = in.readLine();

System.out.print(name +" take over the world through the " +y+ " years. Mu-ha-ha!");
}
}
