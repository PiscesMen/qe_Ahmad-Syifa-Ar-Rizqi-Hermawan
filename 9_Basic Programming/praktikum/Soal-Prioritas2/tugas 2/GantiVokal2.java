public class GantiVokal2 {
    public static void main(String[] args) {
        String kata = "sepulsa mantab jiwa";
        String kataBaru = "";

        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);
            if (huruf == 'a') {
                kataBaru += '4';
            } else if (huruf == 'e') {
                kataBaru += '3';
            } else if (huruf == 'i') {
                kataBaru += '1';
            } else if (huruf == 'o') {
                kataBaru += '0';
            } else {
                kataBaru += huruf;
            }
        }

        System.out.println("Kata setelah mengganti vokal menjadi angka: " + kataBaru);
    }
}
