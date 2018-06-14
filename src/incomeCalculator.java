import java.util.Scanner;
public class incomeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        System.out.println("Nhập hệ số lương: ");
        a=scanner.nextDouble();

        if ((1 <= a) && (a <= 5)) {
            double b;
            System.out.println("Nhập số năm làm việc: ");
            b=scanner.nextDouble();

            double c = a*4000000 + b*500000;
            System.out.println("Lương của bạn : "+c);


        }else {
            System.out.println("Sai hệ số lương!");
        }
    }
}
