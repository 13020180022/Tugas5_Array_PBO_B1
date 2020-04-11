import java.util.Scanner;

public class jumlah {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka1, angka2, angka3, angka4, angka5,jumlah;
        System.out.print("Masukan Input Pertama: ");
        angka1 = input.nextInt();
        System.out.print("Masukan Input Kedua: ");
        angka2 = input.nextInt();
	System.out.print("Masukan Input ketiga: ");
        angka3 = input.nextInt();
        System.out.print("Masukan Input Keempat: ");
        angka4 = input.nextInt();
	System.out.print("Masukan Input kelima: ");
        angka5 = input.nextInt();
        jumlah = angka1 + angka2 + angka3 + angka4 + angka5;
        System.out.println("Jumlah: "+jumlah);
    }
}
