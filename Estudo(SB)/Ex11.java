import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int a,b,c,d;
        double f;
        System.out.println("Digite o valor de A: ");
        a = e.nextInt();
        System.out.println("Digite o valor de B: ");
        b = e.nextInt();
        System.out.println("Digite o valor de C: ");
        c = e.nextInt();
        d = (b*b)-(4*a*c);
        f = Math.sqrt(d);
        
        System.out.println("Valor de delta é: " + d + " e  a raiz é " + f);
    }
}
