import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        double km,d,tkm,td,t;
        System.out.println("Quantidade de KM percorridos com o carro alugado: ");
        km = e.nextDouble();
        System.out.println("Quantidade de dias que foi alugado: ");
        d = e.nextDouble();
        tkm = km*0.20;
        td = d*90;
        t = td+tkm;
        System.out.println("Preço total a pagar: " + t);


    }
}
