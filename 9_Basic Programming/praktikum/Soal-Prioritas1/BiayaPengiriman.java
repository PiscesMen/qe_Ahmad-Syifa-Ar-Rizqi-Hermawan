public class BiayaPengiriman {
    public static int hitungBiayaPengiriman(int beratPaket, int jarakTempuh) {
        int biayaBerat;
        int biayaJarak;

        if (beratPaket < 2) {
            biayaBerat = 10000;
        } else if (beratPaket <= 7) {
            biayaBerat = 15000;
        } else if (beratPaket <= 15) {
            biayaBerat = 25000;
        } else {
            biayaBerat = 40000;
        }

        if (jarakTempuh < 1) {
            biayaJarak = 2000;
        } else if (jarakTempuh <= 7) {
            biayaJarak = 5000;
        } else if (jarakTempuh <= 15) {
            biayaJarak = 10000;
        } else {
            biayaJarak = 20000;
        }

        return biayaBerat + biayaJarak;
    }

    public static void main(String[] args) {
        // Test Case 1
        int beratPaket1 = 5;
        int jarakTempuh1 = 6;
        int biaya1 = hitungBiayaPengiriman(beratPaket1, jarakTempuh1);
        System.out.println("Biaya: Rp " + biaya1);

        // Test Case 2
        int beratPaket2 = 9;
        int jarakTempuh2 = 29;
        int biaya2 = hitungBiayaPengiriman(beratPaket2, jarakTempuh2);
        System.out.println("Biaya: Rp " + biaya2);
    }
}
