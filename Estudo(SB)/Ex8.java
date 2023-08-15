import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        float m,km,hm,dam,dm,cm,mm;
        System.out.println("Digite uma distância em metros: ");
        m = e.nextFloat();
        System.out.println("A distância de " + m + " corresponde a: ");
        dm = m*10;
        cm = m*100;
        mm = m*1000;
        dam = m/10;
        hm = m/100;
        km = m/1000;
        System.out.println(km + "Km");
        System.out.println(hm + "Hm");
        System.out.println(dam + "Dam");
        System.out.println(dm + "Dm");
        System.out.println(cm + "Cm");
        System.out.println(mm + "Mm");
    
    }
}
