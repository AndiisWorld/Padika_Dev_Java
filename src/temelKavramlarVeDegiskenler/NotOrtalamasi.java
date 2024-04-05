package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya,turkce, tarih,muzik;

        Scanner sc=new Scanner(System.in);
        System.out.println("Matematik notunuz : ");
        mat=sc.nextInt();
        System.out.println(mat);
        turkce=sc.nextInt();
        System.out.println(turkce);
        fizik=sc.nextInt();
        System.out.println(fizik);
        tarih=sc.nextInt();
        System.out.println(tarih);
        muzik=sc.nextInt();
        System.out.println(muzik);
        kimya=sc.nextInt();
        System.out.println(kimya);

        double sonuc=(mat+fizik+tarih+turkce+kimya+muzik);
        double ortalama=sonuc/6.0;
        System.out.println(ortalama);
        //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
        //60'dan büyük ise ekrana " Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın

//ternar
        String result = ortalama>60? "Sinifi Gecti":"Sinifda Kaldi";
        System.out.println(result);


        switch((int)ortalama) {
            case 70:
                System.out.println("Sinifi Gecti");
                break;
            default:
                System.out.println("Sinifda Kaldi");
        }

    }
}
