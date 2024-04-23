import java.util.Scanner;

public class Main {
public static void main(String[] args) {
int km;
double  perKM=2.20, total, startprice = 10;

Scanner input = new Scanner(System.in);
    System.out.print("Mesafeyi KM Cinsi Giriniz: ");
    km = input.nextInt();
    total = (km * perKM);
    total += startprice;

    total = (total < 20) ? 20 : total;
    System.out.println("Toplam Tutar: " + total);

    }
}



















