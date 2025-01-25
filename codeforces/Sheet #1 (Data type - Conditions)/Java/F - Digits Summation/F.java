import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong(); 
        
        System.out.println((num1 % 10) + (num2 % 10));
    }
}
