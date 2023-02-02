import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pierwszy wektor(n): ");
        float[] v = new float[sc.nextInt()];
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]: ");
            v[i] = sc.nextFloat();
        }

        System.out.print("Drugi wektor(n): ");
        float[] u = new float[sc.nextInt()];
        for (int i = 0; i < u.length; i++) {
            System.out.print("u[" + i + "]: ");
            u[i] = sc.nextFloat();
        }

        System.out.print("Trzeci wektor(n): ");
        float[] k = new float[sc.nextInt()];
        for (int i = 0; i < k.length; i++) {
            System.out.print("u[" + i + "]: ");
            k[i] = sc.nextFloat();
        }

        System.out.print("Skalar: ");
        float a = sc.nextFloat();

        sc.close();

        System.out.println("Pierwszy wektor: " + Arrays.toString(v));
        System.out.println("Drugi wektor: " + Arrays.toString(u));

        System.out.println("Suma: " + Arrays.toString(Vektor.sum(v,u)));
        System.out.println("Odejmowanie (1 od 2): " + Arrays.toString(Vektor.substract(v,u)));
        System.out.println("Mnozenie: " + Arrays.toString(Vektor.multiply(v,u)));
        System.out.println("Mnozenie przez skalar(" + a + "): " + Arrays.toString(Vektor.multiply_skalar(v,a)));
        System.out.println("Dzielenie przez skalar(" + a + "): " + Arrays.toString(Vektor.divide(v,a)));
        System.out.println("Dlugosc wektora 1: " + v.length);
        System.out.println("Dlugosc wektora 2: " + u.length);
        System.out.println("Iloczyn skalarny: " + Vektor.dotProduct(v,u));
        System.out.println("Iloczyn wiektorowy: " + Arrays.toString(Vektor.crossProduct(v,u)));
        System.out.println("Iloczyn mieszany: " + Arrays.toString(Vektor.iloczyn_mieszany(v,u,k)));
        System.out.println("Iloczyn wiektorowy: " + Arrays.toString(Vektor.crossProduct(v,u)));
    }
}