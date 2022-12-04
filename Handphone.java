public class Handphone extends Perangkat {
    protected boolean fingerprint;
    
    public Handphone (String drive, int ram, double processor, boolean fingerprint) {
        super(drive, ram, processor, fingerprint);
    }

    public void informasi() {
        if (fingerprint){
            System.out.println("Handphone ini memiliki drive " + drive + " dengan ram sebesar " + ram + " GB dan processor dengan kecepatan " + processor + " GHz. Hp ini memiliki fingerprint");
            System.out.println();
        } else {
            System.out.println("Handphone ini memiliki drive " + drive + " dengan ram sebesar " + ram + " GB dan processor dengan kecepatan " + processor + " GHz. Hp ini TIDAK memiliki fingerprint");
            System.out.println();
        }
    }

    public void telfon(int no_hp) {
        System.out.println("Handphone berhasil menyambung ke "+ no_hp);
    }
    
    public void KirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirimkan SMS ke " + no_hp);
    }

    public void KirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirimkan SMS dari " + no_hp1 + "ke nomor " + no_hp2);
    }
}
