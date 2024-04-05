package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class KDV_Tutarli {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		/*
		 *
		 * ava ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
		 * KDV tutarını hesaplayıp ekrana bastıran programı yazın.

			(Not : KDV tutarını 18% olarak alın)

			KDV'siz Fiyat = 10;

				KDV'li Fiyat = 11.8;

				KDV tutarı = 1.8;

			Ödev
				Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
				 tutar 1000 TL'den büyük ise KDV oranını %8 olarak
				 KDV tutarı hesaplayan programı yazınız.
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 */
        Scanner sc=new Scanner(System.in);
        double fiyat=sc.nextInt();
        double kdv_fiyat;
        double kdv;
        if(fiyat>=0 && fiyat<=1000) {
            kdv_fiyat=fiyat+(fiyat*18/100);
            kdv=kdv_fiyat-fiyat;
            System.out.println(kdv_fiyat);
            System.out.println(kdv);}
        else {
            kdv_fiyat=fiyat+(fiyat*8/100);
            System.out.println(kdv_fiyat);
        }

    }
}
