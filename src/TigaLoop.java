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

        int jumlahPrintln = 0;
        System.out.print("Disaring :");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            System.out.print(" " + i);
            jumlahPrintln++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + jumlahPrintln + " kali");

        input.close();
    }
}

/*
 * Jika dimasukkan 5:
 * for      : 1 2 3 4 5
 * while    : 1 2 3 4 5
 * do-while : 1 2 3 4 5
 * i <  n berputar : 4 kali
 * i <= n berputar : 5 kali
 * Disaring : 1 3 5 7
 * Sampai println  : 4 kali
 *
 * Jika dimasukkan 0:
 * for      :
 * while    :
 * do-while : 1
 * Kesimpulan: do-while tetap berjalan sekali karena kondisi dicek di akhir,
 * sedangkan for dan while tidak berjalan sama sekali.
 *
 * Catatan: loop tidak berhenti di i = 8 padahal 8 > 7 karena 8 genap,
 * sehingga continue jalan lebih dulu dan pengecekan i > 7 dilewati.
 * Loop baru break di i = 9.
 */