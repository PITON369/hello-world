import java.util.Scanner; 
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
int i = 2;
System.out.print("Enter an integer: ");
if(sc.hasNextInt()) { 
i = sc.nextInt(); 
System.out.println(i*2);
} else {
System.out.println("You entered is not an integer!");
}
}
}
