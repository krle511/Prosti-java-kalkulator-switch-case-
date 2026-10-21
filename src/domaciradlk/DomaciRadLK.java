package domaciradlk;

import java.util.Scanner;

public class DomaciRadLK {

    public static void main(String[] args) {
        
        double br1, br2;
        Scanner unos = new Scanner(System.in);
        
        System.out.println("+, -, *, ili /");
        System.out.print("Izaberite operaciju: ");
        char operacija = unos.next().charAt(0);
        
        System.out.print("Upisite prvi broj: ");
        br1 = unos.nextDouble();
        
        System.out.print("Upisite drugi broj: ");
        br2 = unos.nextDouble();
        
        switch (operacija) {
            case '+':
                System.out.println(br1 + " + " + br2 + " = " + (br1 + br2));
                break;
            case '-':
                System.out.println(br1 + " - " + br2 + " = " + (br1 - br2));
                break;
            case '*':
                System.out.println(br1 + " * " + br2 + " = " + (br1 * br2));
                break;
            case '/':
                System.out.println(br1 + " / " + br2 + " = " + (br1 / br2));
                break;
            default:
                System.out.println("Korisnik je uneo nedefinisanu operaciju!!!");
        }
    }
}
    

