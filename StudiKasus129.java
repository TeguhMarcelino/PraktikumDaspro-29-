import java.util.Scanner;
public class StudiKasus129 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();
        totalHarga = jumlahCup*hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
            totalBayar = totalHarga - diskon;
        }else{
            totalBayar = totalHarga - diskon;
        }
        System.out.println("Total harga : " +totalHarga);
        System.out.println("Diskon = " +diskon);
        System.out.println("Total bayar : " +totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian = " +kembalian);
        }else{
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp." +kurang);
        }
    }
}
