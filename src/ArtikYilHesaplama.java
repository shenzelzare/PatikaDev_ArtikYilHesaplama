import java.util.Scanner;

public class ArtikYilHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yil giriniz : ");
        int yil = scanner.nextInt();
        if (yil%4==0 && yil%100!=0){
            System.out.println(yil + " bir artik yildir");
        }
        else if (yil%400==0){
            System.out.println(yil + " bir artik yildir");
        }
        else {
            System.out.println(yil + " bir artik yil degildir");
        }
    }
}
