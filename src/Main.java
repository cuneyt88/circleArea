import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi=3.14;
        int r;
        int alfa;


        Scanner inp = new Scanner(System.in);
        System.out.print("Daire içim bir yarıçap giriniz: ");
        r=inp.nextInt();
        System.out.print("Alan için bir açı giriniz: ");
        alfa=inp.nextInt();

        double area= (pi*(r*r)*alfa)/360;

        System.out.println("alan= " + area);
    }
}