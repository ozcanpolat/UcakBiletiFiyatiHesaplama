import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas,type;
        double total;

        Scanner input= new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe=input.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas= input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) :");
        type=input.nextInt();

        if ((mesafe > 0) && (yas > 0) && ((type == 1) || (type == 2))) {
            total = mesafe * 0.10;
            if (yas < 12) {
                total = total - (total * 0.50);
            } else if (yas >= 12 && yas <= 24) {
                total = total - (total * 0.10);
            } else if (yas > 65) {
                total = total - (total * 0.30);
            } else {
                total *= 1;
            }
            if (type == 1) {
                total *= 1;
            } else if (type == 2) {
                total = (total - (total * 0.20)) * 2;
            }
            System.out.println("Toplam Tutar :" + total);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
