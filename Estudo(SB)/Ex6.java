import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int n1,a,s;
        System.out.println("Digite um número: ");
        n1 = e.nextInt();
        s = n1+1;
        a = n1-1;
        System.out.println("O antecessor de " + n1 + " é " + a);
        System.out.println("O sucessor de " + n1 + " é " + s);
    }
}
