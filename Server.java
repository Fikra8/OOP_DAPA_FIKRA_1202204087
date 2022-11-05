import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();

        // TODO Create Menu
        Menu menu0 = new Menu();
        menu0.setName("Nasi Omlet");
        menu0.setCategory("Makanan");
        menu0.setPrice(150000);

        Menu menu1 = new Menu();
        menu1.setName("STMJ");
        menu1.setCategory("Minuman");
        menu1.setPrice(8000);

        Menu menu2 = new Menu();
        menu2.setName("Basreng");
        menu2.setCategory("Snack");
        menu2.setPrice(5000);

        // TODO Insert Menu to Database
        db.setInsert(menu0);
        db.setInsert(menu1);
        db.setInsert(menu2);

        // TODO Display Main Menu
        System.out.println("Selamat datang di Warnus!");
        System.out.println("Silahkan daftar dulu");
        System.out.println("=========================");
        System.out.print("Masukkan nama = ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("No. Handphone: ");
        int phoneNumber = scanner.nextInt();

        // TODO Create User
        User user = new User();
        user.setname(name);
        user.setphoneNumber(phoneNumber);
        user.register();

        // Display Menu
        while (true) {
            System.out.println("===========================");
            System.out.println("1. Menu");
            System.out.println("2. Pilih Menu");
            System.out.println("3. Keluar");
            System.out.println("===========================");
            System.out.print("Masukkan Pilihan Menu: ");
            int menu = scanner.nextInt();
            if (menu == 1) {
                db.setShow();
            } else if (menu == 2) {
                System.out.print("Masukkan Nama Menu: ");
                String search = scanner.next();
                db.setSearch(search);
            } else if (menu == 3) {
                System.out.println("Terimakasih telah kesini");
                break;
            } else {
                System.out.println("Input Salah");
            }
    }
}
}