import java.util.Objects;

public class Setor extends User {
    public static Integer setor;

    public static void viewSetor(String user) {
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("NOMINAL : ");
        var input = BankApp.inputNumber();
        if (Objects.equals(input, "x")) {
            User.viewMenuPage(user);
        }
        System.out.println("-----------------------------");
        int setor = Integer.parseInt(input);
        if (setor >= 0) {
            BankApp.addTrx(user, "Setor   ", setor);
            User.viewMenuPage(user);
        } else {
            System.out.println("Input nominal > 0");
            viewSetor(user);
        }
    }
}