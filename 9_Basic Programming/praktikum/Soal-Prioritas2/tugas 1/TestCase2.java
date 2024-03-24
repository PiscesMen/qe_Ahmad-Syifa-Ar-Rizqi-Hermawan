public class TestCase2 {
    
    public static void main(String[] args) {
        int jumlahAngka = 10;
        int n = 8;
        
        System.out.println("Menampilkan 10 angka yang habis dibagi dengan " + n + ":");
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