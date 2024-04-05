package kosulluIfadeler;

import java.util.Scanner;

public class Easy_Hesap_Makinesi {
    public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
    int a = sc.nextInt();
		System.out.println("Enter second number");
    int b = sc.nextInt();
		System.out.println("Emeliyyati daxil edin");
    String str = sc.next(); // (* ,/ , +,-)
		switch (str) {
        case "*":
            System.out.println("= " + (a * b));
            break;

        case "/":
            if (b != 0) {
                System.out.println("= " + (a / b));
            } else {
                System.out.println("Eded o-a bolunmez");
            }
            break;
        case "-":
            System.out.println("= " + (a - b));
            break;
        case "+":
            System.out.println("= " + (a + b));
            break;
        default:
            System.out.println("Bele emeliyyat yoxdur");
    }}
}
