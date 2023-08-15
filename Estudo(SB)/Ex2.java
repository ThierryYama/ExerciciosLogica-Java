import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        String nome;
        System.out.println("Qual o seu nome ?");
        nome = e.nextLine();
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }
}
