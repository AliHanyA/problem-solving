import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();
 
        final double PI = 3.141592653;
 
        System.out.printf("%.9f%n", PI * Math.pow(R, 2));
    }
}
