import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue = scanner.nextInt();
        long longLongValue = scanner.nextLong();
        char charValue = scanner.next().charAt(0);
        float floatValue = scanner.nextFloat();
        double doubleValue = scanner.nextDouble();
 
        System.out.println(intValue);
        System.out.println(longLongValue);
        System.out.println(charValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        
 
        scanner.close();
    }
}
