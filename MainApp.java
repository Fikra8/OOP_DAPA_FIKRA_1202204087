public class MainApp {
    public static void main(String[] args) {        

        Perangkat perangkat = new Perangkat(null, 0, 0);

        Handphone hp = new Handphone(null, 0, 0, true);
        hp.drive = "Samsung";
        hp.ram = 4;
        hp.processor = 4.0;
        hp.fingerprint = true;

        Laptop Lp = new Laptop(null, 0, 0, false);
        Lp.drive = "Seagate";
        Lp.ram = 32;
        Lp.processor = 5.0;
        Lp.webcam = false;

        perangkat.informasi();

        System.out.println();

        Lp.informasi();
        Lp.bukaGame("WAR THUNDER");
        Lp.KirimEmail("mfikra@gmail.com");
        Lp.KirimEmail("cekemail123@gmail.com", "nerimaemail123@gmail.com");

        System.out.println();

        hp.informasi();
        hp.telfon(62123456);
        hp.KirimSMS(62654321);
        hp.KirimSMS(62123456, 62654321);
    }
}
