import java.util.Scanner;
public class Main {
    public static int usAlma(int us, int taban){
        if(us == 0){
            return 1;
        }

        return taban * usAlma(us -1,taban);
    }

    public static void main(String[] args) {
        int us,taban;
        Scanner input = new Scanner(System.in);

        System.out.println("us degerini giriniz:");
        us = input.nextInt();

        System.out.println("taban degerini giriniz:");
        taban = input.nextInt();

        System.out.println("sonuc "  + usAlma(us,taban) );
    }
}