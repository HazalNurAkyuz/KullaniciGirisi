import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String k_adi,sifre;
        System.out.print("Kullanici Adini Giriniz :");
        k_adi = input.nextLine();
        System.out.print("Sifreyi Giriniz :");
        sifre = input.nextLine();
        if (k_adi.equals("java") && sifre.equals("123")) {
            System.out.println("Başarili Bir Sekilde Giris Yapildi");
        }
        else {
            System.out.println("Kullanici Adiniz Yada Parolaniz Yanlis!");

        }
    }
}