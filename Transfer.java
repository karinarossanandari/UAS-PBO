import java.util.Objects;

public class Transfer extends User {
    public static Integer transfer;

    public static void viewTransfer(String user) {
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("NOMINAL : ");
        var input = BankApp.inputNumber();
        if (Objects.equals(input, "x")) {
            User.viewMenuPage(user);
        }
        System.out.print("TUJUAN REKENING : ");
        var tujuan = BankApp.input();
        Login.cekUser(tujuan);
        System.out.println("-----------------------------");
        int transfer = Integer.parseInt(input);
        if (transfer <= BankApp.cekSaldo(user)) {
            BankApp.addTrx(user, "Transfer", -transfer);
            BankApp.addTrx(tujuan, "Transfer", transfer);
            User.viewMenuPage(user);
        } else {
            System.out.println("Saldo Tidak Cukup!");
            viewTransfer(user);
        }
    }
}