import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int n1,n2,n3;
        System.out.println("Digite um valor: ");
        n1 = e.nextInt();
        System.out.println("Digite outro valor: ");
        n2 = e.nextInt();
        n3 = n1+n2;
        System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a " + n3);

    }
}
