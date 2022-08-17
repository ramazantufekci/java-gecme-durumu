import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        int matTmp = girdi.nextInt();
        mat = (matTmp>0&&matTmp<100)?matTmp:0;

        System.out.print("Fizik notunuz : ");
        int fizikTmp = girdi.nextInt();
        fizik = (fizikTmp>0&&fizikTmp<100)?fizikTmp:0;

        System.out.print("Türkçe notunuz : ");
        int turkceTmp = girdi.nextInt();
        turkce = (turkceTmp>0&&turkceTmp<100)?turkceTmp:0;

        System.out.print("Kimya notunuz : ");
        int kimyaTmp = girdi.nextInt();
        kimya = (kimyaTmp>0&&kimyaTmp<100)?kimyaTmp:0;

        System.out.print("Müzik notunuz : ");
        int muzikTmp = girdi.nextInt();
        muzik = (muzikTmp>0&&muzikTmp<100)?muzikTmp:0;

        float avarage = (mat+fizik+turkce+kimya+muzik)/5;

        if(avarage<=55){
            System.out.println("Sınıfta kaldınız. seneye tekrar görüşmek üzere !");
        }else{
            System.out.println("Tebrikler,sınıf geçtiniz !");

        }
        System.out.println("Ortalamanız :"+avarage);


    }
}
