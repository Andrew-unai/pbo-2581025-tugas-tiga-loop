import java.util.Scanner;

public class TigaLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        System.out.print("for      :");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.print("while    :");
        int a = 1;
        while (a <= n) {
            System.out.print(" " + a);
            a++;
        }
        System.out.println();

        System.out.print("do-while :");
        int b = 1;
        do {
            System.out.print(" " + b);
            b++;
        } while (b <= n);
        System.out.println();

        int kurangDari = 0;
        for (int i = 1; i < n; i++) {
            kurangDari++;
        }
        int kurangSamaDengan = 0;
        for (int i = 1; i <= n; i++) {
            kurangSamaDengan++;
        }
        System.out.println();
        System.out.println("i <  n berputar : " + kurangDari + " kali");
        System.out.println("i <= n berputar : " + kurangSamaDengan + " kali");

        input.close();
    }
}