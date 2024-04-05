package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class ManavKassa {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);


		/*2,14 TL
		Elma : 3,67 TL
		Domates : 1,11 TL
		Muz: 0,95 TL
		Patlıcan : 5,00 TL
		Örnek Çıktı;

		*Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL*/


        double armud,elma,domates,muz,patlican,toplam;

        System.out.println("Armud");
        armud=sc.nextDouble();
        System.out.println("Elma");

        elma=sc.nextDouble();
        System.out.println("domates");

        domates=sc.nextDouble();
        System.out.println("muz");

        muz=sc.nextDouble();
        System.out.println("patlican");

        patlican=sc.nextDouble();
        //toplam=sc.nextInt();

        System.out.println("Kac kilo");
        System.out.println("Armud");
        double kilarmud=sc.nextDouble();
        System.out.println("Elma");
        double kiloelma=sc.nextDouble();
        System.out.println("Domates");
        double kilodomates=sc.nextDouble();
        System.out.println("Muz");
        double kilomuz=sc.nextDouble();
        System.out.println("Patlican");
        double kilopatlican=sc.nextDouble();

        System.out.println("-----------------");
        System.out.println(armud*kilarmud +" TL");
        System.out.println("-----------------");
        System.out.println(elma*kiloelma +" TL");
        System.out.println("-----------------");
        System.out.println(domates*kilodomates +" TL");
        System.out.println("-----------------");
        System.out.println(muz*kilomuz +" TL");
        System.out.println("-----------------");
        System.out.println(patlican*kilopatlican +" TL");

        System.out.println("---------------------------");

        toplam=armud*kilarmud+elma*kiloelma+domates*kilodomates+muz*kilomuz+patlican*kilopatlican;
        System.out.println("Toplam Tutar : "+toplam + "TL");
    }
}
