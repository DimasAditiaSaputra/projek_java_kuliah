import java.util.Scanner;
import datas.Mangga;
import datas.Jeruk;
import datas.Anggur;
import controllers.Compute;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Objek buah
            Mangga mangga = new Mangga("Mg", "Mangga", 17000.0);
            Jeruk jeruk = new Jeruk("Jr", "Jeruk", 40000.0);
            Anggur anggur = new Anggur("Ag", "Anggur", 30000.0);

            // menu 
            Compute.displayMenu(anggur);
            Compute.displayMenu(jeruk);
            Compute.displayMenu(anggur);
            System.out.println("");

            // Input kode buah
            System.out.print("Masukkan kode buah yang mau di beli : ");
            String kodeBuah = input.next().trim();

            // Input jumlah beli dalam kg
            System.out.print("Masukkan jumlah beli (Kg): ");
            int jumlahBeli = input.nextInt();

            double totalBayar = 0;
            String namaBuah = "";
            double hargaPerKg = 0;

            switch (kodeBuah.toLowerCase()) {
                case "mg":
                    totalBayar = Compute.bayar(mangga.getHarga(), jumlahBeli);
                    namaBuah = mangga.getNamaBuah();
                    hargaPerKg = mangga.getHarga();
                    break;
                case "jr":
                    totalBayar = Compute.bayar(jeruk.getHarga(), jumlahBeli);
                    namaBuah = jeruk.getNamaBuah();
                    hargaPerKg = jeruk.getHarga();
                    break;
                case "ag":
                    totalBayar = Compute.bayar(anggur.getHarga(), jumlahBeli);
                    namaBuah = anggur.getNamaBuah();
                    hargaPerKg = anggur.getHarga();
                    break;
                default:
                    System.out.println("Kode buah tidak ditemukan!");
                    return;
            }

            // Tampilkan informasi transaksi
            Compute.display(kodeBuah, namaBuah, hargaPerKg, jumlahBeli, totalBayar);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            System.out.println("Masukan kode buah dan jumlah beli yang benar");
        } finally {
            input.close();
        }
    }
}
