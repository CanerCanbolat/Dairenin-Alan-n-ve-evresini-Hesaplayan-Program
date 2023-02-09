import java.util.Scanner;
public class Daire {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        int r = input.nextInt();
        System.out.print("Daire diliminin açısını giriniz :");
        double  𝛼 = input.nextDouble();
        double Alan = (Math.PI*r*r* 𝛼) / 360;
        System.out.println("Alan :"+Alan);


    }
}
