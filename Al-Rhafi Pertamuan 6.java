import java.util.Scanner;

public class DaftarNamaTamu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Meminta input jumlah tamu
        System.out.print("Masukkan jumlah tamu: ");
        int jumlahTamu = input.nextInt();
        input.nextLine(); // Membersihkan buffer keyboard
        
        // Membuat array dengan ukuran sesuai jumlah tamu
        String[] namaTamu = new String[jumlahTamu];
        
        // 2. Menginput nama-nama tamu satu per satu (mengisi array)
        System.out.println("\n=== INPUT NAMA TAMU ===");
        for (int i = 0; i < namaTamu.length; i++) {
            System.out.print("Masukkan nama tamu ke-" + (i + 1) + ": ");
            namaTamu[i] = input.nextLine();
        }
        
        // 3. Menampilkan semua nama tamu dengan format yang rapi
        System.out.println("\n=== DAFTAR NAMA TAMU ===");
        for (int i = 0; i < namaTamu.length; i++) {
            System.out.println("Tamu " + (i + 1) + ": " + namaTamu[i]);
        }
        
        // 4. Menghitung tamu yang namanya diawali huruf 'A'
        int hitungA = 0;
        for (int i = 0; i < namaTamu.length; i++) {
            // Menggunakan method startsWith() untuk mengecek huruf pertama
            if (namaTamu[i].startsWith("A") || namaTamu[i].startsWith("a")) {
                hitungA++;
            }
        }
        
        // Menampilkan hasil perhitungan
        System.out.println("\n=== STATISTIK ===");
        System.out.println("Jumlah tamu yang namanya diawali huruf 'A': " + hitungA + " orang");
        
        // Bonus: Tampilkan siapa saja yang namanya diawali A
        if (hitungA > 0) {
            System.out.print("Yaitu: ");
            for (int i = 0; i < namaTamu.length; i++) {
                if (namaTamu[i].startsWith("A") || namaTamu[i].startsWith("a")) {
                    System.out.print(namaTamu[i] + " ");
                }
            }
            System.out.println();
        }
        
        input.close();
    }
}