import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,dom=1.11,muz=0.95,pat=5.00;
        int kg;
        Scanner gir=new Scanner(System.in);

        System.out.print("Armut kaç kilo ? :");
        kg=gir.nextInt();
        System.out.print("Elma kaç kilo ? :");
        kg=gir.nextInt();
        System.out.print("Domates kaç kilo ? :");
        kg=gir.nextInt();
        System.out.print("Muz kaç kilo ? :");
        kg=gir.nextInt();
        System.out.print("Patlıcan kaç kilo ? :");
        kg=gir.nextInt();

        double toplamTutar=(armut*kg)+(elma*kg)+(dom*kg)+(muz*kg)+(pat*kg);
        System.out.print("Toplam Tutar:"+toplamTutar);

    }
}