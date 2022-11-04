import java.util.Scanner;

public class MainSwitch {

    public static void main(String[] args) {

        int n1, n2, operation;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlem : ");
        operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Bölme : " + (n1 / n2));
                } else {
                    System.out.println("Bir Sayı  0 'a Bölünemez!!");
                }
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız! Tekrar Deneyiniz.");
        }
    }
}
