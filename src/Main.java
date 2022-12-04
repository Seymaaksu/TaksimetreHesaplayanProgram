import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int km;
double ucret, perKm=2.20;
Scanner input= new Scanner(System.in);
System.out.println("Km'yi giriniz:");
km = input.nextInt();
ucret = 10+(km*perKm);
ucret= (ucret <20) ? 20 : ucret;
System.out.println("Ücret:" +ucret);

    }
}