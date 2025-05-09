package latmethod2_202457201062;
import javax.swing.JOptionPane;

public class Main {
void kalkulator(String operasi, double bil1, double bil2) {
        double hasil;

        switch (operasi) {
            case "penjumlahan":
                hasil = bil1 + bil2;
                break;
            default:
                hasil = 0;
        }

        String txtMessage = "Hasil operasi " + operasi + " " + bil1 + " dan " + bil2 + " adalah " + hasil;
        JOptionPane.showMessageDialog(null, txtMessage, "Hasil Operasi", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Main lm = new Main();
        lm.kalkulator("penjumlahan", 3, 5);
 
        
    
    
}
}