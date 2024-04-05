package kosulluIfadeler;

import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        int mesafe=sc.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        int yas=sc.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş )");
        int yolculukTipi = sc.nextInt(); //  1 veya 2 olarak ayarlanabilir
        double normalTutar=mesafe*0.1;//Mesafe başına ücret 0,10 TL / km olarak alın
        if(mesafe>0 && yas>0 && (yolculukTipi==1||yolculukTipi==2)) {
            if (yolculukTipi==1) {
                if (yas < 12) {
                    double yasIndirimOrani =0.5;
                    int yasIndirimi = (int) (normalTutar * yasIndirimOrani);
                    int indirimliTutar = (int) (normalTutar - yasIndirimi);
                    int toplamTutar=indirimliTutar*2;
                    System.out.println(toplamTutar);
                    //Toplam Tutar = (135-27)* 2 = 216 TL
                }
                 if (yas>=12 && yas<=24){
                    double yasIndirimOrani =0.1;
                    int yasIndirimi = (int) (normalTutar * yasIndirimOrani);
                    int indirimliTutar = (int) (normalTutar - yasIndirimi);
                     int toplamTutar=indirimliTutar*2;
                     System.out.println(toplamTutar);
                 } if (yas>65){
                    double yasIndirimOrani =0.3;
                    int yasIndirimi = (int) (normalTutar * yasIndirimOrani);
                    int indirimliTutar = (int) (normalTutar - yasIndirimi);
                    int toplamTutar=indirimliTutar*2;
                    System.out.println(toplamTutar);
                }
            } else if (yolculukTipi==2) {
                if (yas < 12) {
                    double yasIndirimOrani =0.5;
                    int yasIndirimi = (int) (normalTutar * yasIndirimOrani);
                    int indirimliTutar = (int) (normalTutar - yasIndirimi);
                    int gedisgelis = (int) (indirimliTutar * 0.2);
                    double toplamTutar = (indirimliTutar - gedisgelis) * 2;
                    System.out.println(toplamTutar);
                }
                if (yas>=12 && yas<=24){
                    double yasIndirimOrani =0.1;
                    int yasIndirimi = (int) (normalTutar * yasIndirimOrani);
                    int indirimliTutar = (int) (normalTutar - yasIndirimi);
                    int gedisgelis = (int) (indirimliTutar * 0.2);
                    double toplamTutar = (indirimliTutar - gedisgelis) * 2;
                    System.out.println(toplamTutar);
                } if (yas>65){
                    double yasIndirimOrani =0.3;
                    int yasIndirimi = (int) (normalTutar * yasIndirimOrani);
                    int indirimliTutar = (int) (normalTutar - yasIndirimi);
                    int gedisgelis = (int) (indirimliTutar * 0.2);
                    double toplamTutar = (indirimliTutar - gedisgelis) * 2;
                    System.out.println(toplamTutar);
                }
        }} else {
            System.out.println("Hatali Veri Girdiniz ! ");
        }


       /* Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
        Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
        İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
        Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
        Toplam Tutar = (135-27)* 2 = 216 TL*/

    }
}
