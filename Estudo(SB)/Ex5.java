import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        double n1,n2,n3;
        System.out.println("Nota 1: ");
        n1 = e.nextDouble();
        System.out.println("Nota 2: ");
        n2 = e.nextDouble();
        n3 = (n1+n2)/2;
        System.out.println("A média entre " + n1 + " e " + n2 + " é igual a " + n3);
    }
}
