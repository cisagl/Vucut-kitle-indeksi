import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, vki;

        System.out.print("Lütfen boy bilgisi giriniz: ");
        Scanner boySc = new Scanner(System.in);
        boy = boySc.nextDouble();

        System.out.print("Lütfen kilo bilgisi giriniz: ");
        Scanner kiloSc = new Scanner(System.in);
        kilo = kiloSc.nextDouble();

        vki = kilo/boy/boy;
        System.out.println("Vücut kitle indeksiniz: " + vki);
    }
}