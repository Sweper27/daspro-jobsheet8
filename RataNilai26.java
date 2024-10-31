import java.util.Scanner;

public class RataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j,i;
        float nilai, totalNilai=0, RataNilai;

        i=1;
        while (1<=5) {
            System.out.println("Input Nilai Mahasiswa ke -" + i);
            totalNilai=0;
            for (j=1;j<=5;j++) {
                System.out.print("Nilai ke-" +j + "  = ");
                nilai=sc.nextInt();
                totalNilai+=nilai;
            }
            RataNilai = totalNilai/5;
        System.out.println("Rata-Rata Nilai Mahasiswa Ke " + i + " adalah " + RataNilai );

    i++;
        }
        
    }
}
