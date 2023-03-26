
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************");
        String islemler = "1.toplama\n"
                           +"2.cikarma\n"
                            +"3.carpma\n"
                            +"4.bolme";
        System.out.println(islemler);
        System.out.println("*******************");
        System.out.println("yapmak istediginiz islemi giriniz:");
        String islem = scanner.nextLine();
        switch(islem){
            case "1":
                System.out.print("birinci sayi: ");
                int a = scanner.nextInt();
                System.out.print("ikinci sayi: ");
                int b = scanner.nextInt();
                int toplam=a+b;
                System.out.println("sonuc: " + toplam);
                break;
            case "2":
                System.out.print("birinci sayi: ");
                int c = scanner.nextInt();
                System.out.print("ikinci sayi: ");
                int d = scanner.nextInt();
                int cikarma=c-d;
                System.out.println("sonuc: "+cikarma);
                break;
            case "3":
                System.out.print("birinci sayi: ");
                int x = scanner.nextInt();
                System.out.print("ikinci sayi: ");
                int y = scanner.nextInt();
                int carpma=x*y;
                System.out.println("sonuc: " + carpma);
                break;
            case "4":
                System.out.print("birinci sayi: ");
                double t = scanner.nextInt();
                System.out.print("ikinci sayi: ");
                double z = scanner.nextInt();
                double bolme=t/z;
                System.out.println("sonuc: " + bolme);
                break;
                default:
                    System.out.println("lutfen tekrar programi baslatip dogru degeri giriniz.");
                    break;
        }
    }
}
