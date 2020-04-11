public class TCP {
	public static void main(String[] args){
		int a[] = new int[5];
		try{
			a[5] = 100;
			} catch (ArrayIndexOutOfBoundsException e){
		
		System.out.println ("Terjadi exception karena Indeks Array melebihi batas ");
		}finally {
			System.out.println("Selalu Dijalankan");
		}
		System.out.println ("Setelah blok try-catch");
	}
}