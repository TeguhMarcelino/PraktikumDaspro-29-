import java.util.Scanner;
public class StudiKasus229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPKM;

        System.out.print("Nama Mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis Kegiatan(BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen yang diupload (0-4) : ");
        jumlahDokumen = sc.nextInt();
        System.out.print("Peringkat juara (1, 2, 3. Isi 0 jika bukan juara): ");
        peringkatJuara = sc.nextInt();

        int kurangDokumen = 4 - jumlahDokumen;

        if (jumlahDokumen < 4) {
            System.out.print("Status: Dokumen tidak lengkap. Dana penghargaam tidak diberikan. Dokumen kurang " +kurangDokumen);
        }else{
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3){
                    System.out.println("Status: Dokumen lengkap, Dana penghargaan diberikan");
                }else{
                    System.out.println("Status: Dokumen lengkap, tetapi bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan");
                }
            }else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) = ");
                statusPKM = sc.nextInt();
                if (statusPKM == 1){
                    System.out.println("Status: Dokumen lengkap, Dana penghargaan diberikan");
                }else{
                     System.out.println("Status: Dokumen lengkap, namun tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan");
                }
            }else{
                System.out.println("Status: Dokumen lengkap. Kegiatan di luar ketentuan tidak memperoleh dana penghargaan");
            }
        }
    }
}
