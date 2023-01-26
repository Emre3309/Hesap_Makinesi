import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("----------HESAP MAKINESI---------");
        System.out.print("Bir Gayi Giriniz : ");
        int a = klavye.nextInt();
        System.out.print("Bir Gayi Giriniz : ");
        int b = klavye.nextInt();
        System.out.println("***** Bir Islem Seciniz ***** " +
                "\n 1- Toplama : " +
                "\n 2- Cıkarma : " +
                "\n 3- Carpma : " +
                "\n 4- Bolme : ");
        System.out.print("Isleminiz : ");
        int x = klavye.nextInt();
        if(x == 1){
            System.out.println("Islem Sonucu : "+a+"+"+b+"="+(a+b));
        }
        if(x == 2){
            System.out.println("Islem Sonucu : "+a+"-"+b+"="+(a-b));
        }
       if(x == 3){
            System.out.println("Islem Sonucu : "+a+"*"+b+"="+(a*b));
        }
        if(x == 4){
            System.out.println("Islem Sonucu : "+a+"/"+b+"="+(a/b));
        }
    }
}