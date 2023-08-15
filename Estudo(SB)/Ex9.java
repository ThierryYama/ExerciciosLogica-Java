import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        double c,d;
        System.out.println("Quantos R$ tem na sua carteira ? ");
        c = e.nextFloat();
        Math.round (d = c/4.95);
        System.out.println(" Você pode comprar " + d + " Doláres");        
    }
}
