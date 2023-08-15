import java.util.Scanner;

public class Ex16DESAFIO {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int cd,af,daf,tt,tf,t;
        System.out.println("Quantidade de cigarros fumados por dia: ");
        cd = e.nextInt();
        System.out.println("Por quantos anos fumou: ");
        af = e.nextInt();
        
        daf = af*365;
        tf = daf*cd;
        tt = 10*tf;
        t = tt/1440;

        System.out.println("Total em dias de vida perdida: " + t);


    }
}
