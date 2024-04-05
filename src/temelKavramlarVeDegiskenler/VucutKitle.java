package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        /* Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
                *  Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
		 */



        Scanner sc=new Scanner(System.in);
        double boy=sc.nextDouble();
        double kilo=sc.nextDouble();
        double vucutKitleIndexi=kilo/(boy*boy);
        System.out.println(vucutKitleIndexi);

//Kilo (kg) / Boy(m) * Boy(m)
    }
}
