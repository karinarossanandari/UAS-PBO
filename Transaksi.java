import java.util.Objects;

public class Transaksi extends User {
    public static void viewTransaksi(String user) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("| Username\t| Jenis Transaksi\t\t| Nominal\t\t| Saldo Akhir\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------");
        if (user == null) {
            for (int i = 0; i < BankApp.trx1.length; i++) {
                System.out.println("| " + BankApp.trx1[i] + "\t\t\t| " + BankApp.trx2[i] + "\t\t\t| "
                        + BankApp.trx3[i] + "\t\t\t| " + BankApp.getTrx4()[i] + "\t| ");
            }
        } else {
            for (int i = 0; i < BankApp.trx1.length; i++) {
                if (Objects.equals(BankApp.trx1[i], user)) {
                    System.out.println("| " + BankApp.trx1[i] + "\t\t| " + BankApp.trx2[i] + "\t\t\t| "
                            + BankApp.trx3[i] + "\t\t| " + BankApp.getTrx4()[i] + "\t\t\t| ");
                }
            }
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("Tekan enter untuk kembali");
        BankApp.input();
        assert user != null;
        Admin.viewMenuPage(user);
    }
}