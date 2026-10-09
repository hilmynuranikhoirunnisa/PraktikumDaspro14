import java.util.Scanner;
public class StudiKasus2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah Dokumen: ");
        int jumlahDokumen = sc.nextInt();

        boolean syaratLomba = false;
        int peringkat = 0;
        int statusPKM = 0;

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.print("Peringkat Juara: ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                syaratLomba = true;
            }

            if (syaratLomba) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: BerhakMemperolehDana Penghargaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen Tidak Lengkap (kurang " +kurang + " dokumen). Dana Penghargaan Tidak Bisa Diberikan.");
                }
            } else {
                System.out.println("Status : Tidak Memperoleh Dana Penghargaan (hanya untuk Juara 1/2/3). ");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status Pendanaan PKM (1 = lolos, 0 = tidak): ");
            statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                if (jumlahDokumen ==4) {
                    System.out.println("Status: Berhak MemperolehDana Penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen Tidak Lengkap (kurang " + kurang + " dokumen). Dana Penghargaan Tidak Diberikan.");
                }
            } else {
                System.out.println("Status: Tidak Memperoleh Dana Penghargaan (PKM tidak lolos pendanaan).");
            }
        } else {
            System.out.println("Status: TidakMemperoleh Dana Penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }
        sc.close();
    }
}
