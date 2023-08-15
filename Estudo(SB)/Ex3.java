import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        String nome;
        double s;
        
        System.out.println("Nome do Funcionário: ");
        nome = e.nextLine();
        System.out.println("Salário: ");
        s = e.nextDouble();
        System.out.println("O funcionário " + nome + " tem um salário de " + s + " em Junho.");
    }
}
