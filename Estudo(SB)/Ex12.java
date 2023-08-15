import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        double p,n,np;
        System.out.println("Preço do produto: ");
        p = e.nextDouble();
        n = p*0.05;
        np = p - n;
        System.out.println("Preço com desconto: " + np);
    }
}
