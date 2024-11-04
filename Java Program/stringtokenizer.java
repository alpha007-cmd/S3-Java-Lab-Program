import java.util.StringTokenizer; 
import java.util.Scanner; 
public class IntegerSum { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter a line of integers separated by spaces: "); 
String line = scanner.nextLine(); 
StringTokenizer tokenizer = new StringTokenizer(line); 
int sum = 0; 
System.out.println("The integers are:"); 
while (tokenizer.hasMoreTokens()) { 
int number = Integer.parseInt(tokenizer.nextToken()); 
System.out.println(number); 
sum += number; 
} 
System.out.println("The sum of the integers is: " + sum); 
} 
}