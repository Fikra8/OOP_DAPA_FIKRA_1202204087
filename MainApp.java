public class MainApp {
    public static void main(String[] args) {

        TransportasiAir TrpsAir  = new TransportasiAir(0, 0);
        TrpsAir.jumlahKursi = 4;
        TrpsAir.biaya = 20000;

        Sampan s1 = new Sampan(0, 0, 0);
        s1.jumlahKursi = 20;
        s1.biaya = 50000;
        s1.layar = 5;

        Kapal k1 = new Kapal(0, 0, null);
        k1.jumlahKursi = 50;
        k1.biaya = 100000;
        k1.mesin = "Diesel";

        TrpsAir.informasi();
        TrpsAir.berlayar();
        TrpsAir.berlabuh();

        System.out.println();

        s1.informasi();
        s1.berlayar();
        s1.berlabuh();
        s1.berlabuh(2);

        System.out.println();
        k1.informasi();
        k1.berlayar();
        k1.berlayar(40);
        k1.berlabuh();
    }
} 

