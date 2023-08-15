import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int d;
        double s,st;

        System.out.println("Dias trabalhados no mês: ");
        d = e.nextInt();
        s = 8*25;
        st = d*s;
        System.out.println("Salário do Funcionário: " + st);
    }
}
