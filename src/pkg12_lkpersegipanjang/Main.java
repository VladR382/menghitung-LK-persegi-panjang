package pkg12_lkpersegipanjang;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, L, K;
        
        System.out.println("Program Menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("====================================================");
        System.out.println(" p adalah panjang \n l adalah lebar \n L adalah Luas \n K adalah Keliling");
        
        System.out.print("Masukan p = ");
        p = input.nextInt();
        System.out.print("Masukan l = ");
        l = input.nextInt();
        
        L = p * l;
        K = 2 * (p + l);
        
        System.out.println("L = p * l");
        System.out.println("L = " +p+ " x " +l);
        System.out.println("L = " + L + "\n");
        
        System.out.println("K = 2 * (p + l)");
        System.out.println("K = 2 x (" +p+ " + " +l+ ")");
        System.out.println("K = " + K + "\n");
    }
    
}
