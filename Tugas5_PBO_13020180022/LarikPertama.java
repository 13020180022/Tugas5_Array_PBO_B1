// Nama file : LarikPertama.java
// Menampilkan nilai yang berada di elemen larik
 
// mengimpor Java predifined class
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
 
// Deklarasi kelas
public class LarikPertama {
 
   // Metoda main
   public static void main(String[] args) {
 
      int[] larikInteger;
      JTextArea areaTampilan;
      String larik = "Larik : int[ ] larikInteger = new int[ 6 ];\n " +
                     "Indek\tNilai\n";
       
      larikInteger = new int[6];
      areaTampilan = new JTextArea();
 
      // Memberi nilai ke elemen larik
      for (int y = 1; y <= 6; y++)
         larikInteger[y - 1] = y;
 
      // Menampilkan indek dan nilai
      for (int y = 0; y < larikInteger.length; y++)
         larik += y + "\t" + larikInteger[y] + "\n";
 
      areaTampilan.setText(larik);
      JOptionPane.showMessageDialog(null, areaTampilan, "Nilai Elemen Larik",
         JOptionPane.INFORMATION_MESSAGE);
 
      // Mengakhiri aplikasi berpenampilan GUI
      System.exit(0);
   }
}