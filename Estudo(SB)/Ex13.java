import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        double n,p,ns;
        System.out.println("Salário do Funcionário: ");
        p = e.nextDouble();
        n = p*0.15;
        ns = p + n;
        System.out.println("Salário com aumento de 15% : " + ns);
    }
}
