public class RectangleArea {

    public static void main(String[] args) {
        // Test case 1
        System.out.println(checkRectangleType(5, 6)); // Input: panjang: 5, lebar: 6

        // Test case 2
        System.out.println(checkRectangleType(5, 3)); // Input: panjang: 5, lebar: 3
    }

    public static String checkRectangleType(int panjang, int lebar) {
        int luas = panjang * lebar; // Menghitung luas persegi panjang
        if (luas % 2 == 0) { // Jika luas adalah bilangan genap
            return "even rectangle"; // Luas genap
        } else {
            return "odd rectangle"; // Luas ganjil
        }
    }
}
