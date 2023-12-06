import java.util.Locale;
import java.util.Objects;

public class Admin extends Daftar {
    public static void viewMenuPage(String user) {
        System.out.println("-----------------------------");
        System.out.println("Halo, " + user.toUpperCase(Locale.ROOT));
        if (!user.equals("admin")) {
            System.out.println("Saldo saat ini : " + BankApp.cekSaldo(user));
        }
        System.out.println("-----------------------------");
        if (user.equals("admin")) {
            Admin.listMenu();
        } else {
            User.listMenu();
        }
        System.out.print("Input Pilihan : ");
        String pilih = BankApp.input();
        if (user.equals("admin")) {
            Admin.proses(pilih);
        } else {
            User.proses(pilih);
        }
    }

    public static void listMenu() {
        System.out.println("1. Lihat Semua Transaksi");
        System.out.println("2. Lihat Transaksi Per User");
        System.out.println("3. Keluar");
    }

    public static void proses(String pilih) {
        if (Objects.equals(pilih, "1")) {
            Transaksi.viewTransaksi(user);
        } else if (Objects.equals(pilih, "2")) {
            for (int i = 1; i < BankApp.username.length; i++) {
                System.out.println(i + " . " + BankApp.username[i]);
            }
            System.out.print("Input Pilihan : ");
            int name = Integer.parseInt(BankApp.input());
            Transaksi.viewTransaksi(BankApp.username[name]);
        } else if (Objects.equals(pilih, "3")) {
            Login.viewLoginPage();
        } else {
            BankApp.salah();
            viewMenuPage(user);
        }
    }
}