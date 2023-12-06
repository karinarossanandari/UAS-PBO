import java.util.Locale;
import java.util.Objects;

public class User extends Admin {

    public static void listMenu() {
        System.out.println("1. Setor");
        System.out.println("2. Tarik");
        System.out.println("3. Transfer");
        System.out.println("4. Riwayat Transaksi");
        System.out.println("5. Keluar");
    }

    public static void proses(String pilih) {
        if (Objects.equals(pilih, "1")) {
            Setor.viewSetor(user);
        } else if (Objects.equals(pilih, "2")) {
            Tarik.viewTarik(user);
        } else if (Objects.equals(pilih, "3")) {
            Transfer.viewTransfer(user);
        } else if (Objects.equals(pilih, "4")) {
            Transaksi.viewTransaksi(user);
        } else if (Objects.equals(pilih, "5")) {
            Login.viewLoginPage();
        } else {
            BankApp.salah();
        }
        System.out.print("Input Pilihan1 : ");
        int name = Integer.parseInt(BankApp.input());
        Transaksi.viewTransaksi(BankApp.username[name]);
    }
}