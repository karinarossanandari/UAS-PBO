import java.util.Objects;

public class Daftar {

    public static String user;
    public static String pass;

    public static void viewDaftarPage() {
        System.out.println("-----------------------------");
        System.out.println("DAFTAR");
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("Username : ");
        user = BankApp.input();
        cancel(user);
        daftar(user);
        System.out.print("Password : ");
        pass = BankApp.input();
        BankApp.addAccount(user, pass);
        System.out.println("Akun Berhasil Ditambahkan !");
        Login.viewLoginPage();
    }

    public static void daftar(String user) {
        while (BankApp.validasiUser(user)) {
            System.out.println("Username sudah terdaftar!");
            System.out.print("Username : ");
            user = BankApp.input();
            cancel(user);
        }
    }

    public static void cancel(String user) {
        if (Objects.equals(user, "X") || Objects.equals(user, "x")) {
            LandingPage.viewLandingPage();
        }
    }
}