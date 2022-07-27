import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alan,cevre,r,pi;

        pi = 3.14;

        System.out.print("R giriniz: ");
        r = input.nextDouble();
        alan = pi*(r*r);
        cevre = 2*pi*r;

        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);

        System.out.println("");
        double q,a,area;

        System.out.print("Yaricapini giriniz: ");
        q = input.nextDouble();

        System.out.print("Merkez aci olcusu girin: ");
        a = input.nextDouble();

        area = (pi*(q*q)*a)/360;

        System.out.println("Daire Diliminin Alani: " + area);
    }
}
