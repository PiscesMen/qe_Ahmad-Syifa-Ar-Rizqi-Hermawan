public class TestCase1 {
    public static void main(String[] args) {
        int jumlahAngka = 20;
        int n = 5;
        
        System.out.println("Menampilkan 20 angka yang habis dibagi dengan " + n + ":");
        int count = 0;
        int i = 1;
        while (count < jumlahAngka) {
            if (i % n == 0) {
                System.out.println(i + " ");
                count++;
            }
            i++;
        }
    }
}
