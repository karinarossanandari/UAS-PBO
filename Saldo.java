import java.util.Objects;

public class Saldo {

    public static int Saldo;

    public static void viewSaldo(String user) {
        for (int i = (BankApp.trx1.length); i > 0; i--) {
            if (Objects.equals(BankApp.trx1[(i - 1)], user)) {
                Saldo = BankApp.getTrx4()[(i - 1)];
                System.out.println("Saldo saat ini : " + Saldo);
                break;
            } else if (i == 0) {
                System.out.println("Saldo saat ini : 0");
            }
        }
    }
}