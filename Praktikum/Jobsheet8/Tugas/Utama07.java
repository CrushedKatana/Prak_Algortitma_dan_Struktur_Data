package Praktikum.Jobsheet8.Tugas;

import java.util.Scanner;

public class Utama07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kapasitas Gudang: ");
        Gudang07 gudang = new Gudang07(Integer.parseInt(scanner.nextLine()));

        while (true) {
            System.out.println("\n[Kapasitas: " + gudang.size + " Terisi: " + (gudang.top + 1) + "]");
            System.out.println("Menu: ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan Barang");
            System.out.println("4. Lihat Barang teratas");
            System.out.println("5. Lihat Barang terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = Integer.parseInt(scanner.nextLine());

            boolean stop = false;
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = Integer.parseInt(scanner.nextLine());
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang07 barangBaru = new Barang07(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("Pencarian barang berdasarkan kode atau nama");
                    System.out.print("Masukkan kode atau nama barang yang dicari: ");
                    gudang.cariBarang(scanner.nextLine());
                    break;
                case 0:
                    stop = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            if (stop)
                break;
        }
        scanner.close();
    }
}