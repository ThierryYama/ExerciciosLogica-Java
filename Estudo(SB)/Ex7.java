import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        float n1,d,t;
        System.out.println("Digite um número: ");
        n1 = e.nextFloat();
        d = n1*2;
        t = n1/3;
        System.out.println("O dobro de " + n1 + " é " + d);
        System.out.println("A terça parte de " + n1 + " é " + t);
    }
}
