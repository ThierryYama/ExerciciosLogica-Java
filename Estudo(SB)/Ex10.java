import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        double l,h,a,t;
        System.out.println("Digite a altura da parede: ");
        h = e.nextDouble();
        System.out.println("Digita a largura da parede: ");
        l = e.nextDouble();
        a = h*l;
        System.out.println("Área a ser pintada é : " + a);
        t = a/2;
        System.out.println("Quantidade de tinta: " + t);
    }
}
