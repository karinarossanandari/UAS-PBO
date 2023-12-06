import java.util.Objects;

public class Tarik extends User {
    public static Integer tarik;

    public static void viewTarik(String user) {
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("NOMINAL : ");
        var input = BankApp.inputNumber();
        if (Objects.equals(input, "x")) {
            User.viewMenuPage(user);
        }
        int tarik = Integer.parseInt(input);
        if (tarik <= BankApp.cekSaldo(user)) {
            BankApp.addTrx(user, "Tarik   ", (-tarik));
            User.viewMenuPage(user);
        } else {
            System.out.println("Saldo Tidak Cukup!");
            viewTarik(user);
        }

    }
}