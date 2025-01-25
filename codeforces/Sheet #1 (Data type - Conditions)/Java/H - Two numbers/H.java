import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
 
        int floorResult = (int) Math.floor(A / B);
        int ceilResult = (int) Math.ceil(A / B);
        int roundResult = (int) Math.round(A / B);
 
        System.out.println("floor " + (int) A + " / " + (int) B + " = " + floorResult);
        System.out.println("ceil " + (int) A + " / " + (int) B + " = " + ceilResult);
        System.out.println("round " + (int) A + " / " + (int) B + " = " + roundResult);
    }
}
