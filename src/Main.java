import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;

            System.out.println("Matematik notunuzu giriniz:");
            mat=input.nextInt();

            System.out.println("Fizik notunuzu giriniz:");
            fizik=input.nextInt();

            System.out.println("Türkçe notunuzu giriniz:");
            turkce=input.nextInt();

            System.out.println("Kimya notunuzu giriniz:");
            kimya=input.nextInt();

            System.out.println("Müzik notunuzu giriniz:");
            muzik=input.nextInt();


            double ortalama = (mat+fizik+turkce+kimya+muzik)/5;
            if (ortalama >= 55) {
                System.out.println("Tebrikler, sınıfı geçtiniz.");

            } else {
                System.out.println("Sınıfı geçemediniz.");
            }
        



    }
}