public class multidimensi{
 public static void main(String[] args){

  //deklarasi array multidimensi
  String[][] entry = {{"ichsan", "082345789940", "kolaka"},
      {"widya", "081234570001", "pomalaa"},
      {"cati", "087980645320", "sorong"}};
  int i,j;

  //mengambil nilai array kemudian menampilkannya pada console
  for(i=0; i<entry.length; i++){
   for(j=0; j<entry[i].length;){
    System.out.println("Name :"+entry[i][j++]);
    System.out.println("Telp :"+entry[i][j++]);
    System.out.println("Address :"+entry[i][j++]+"\n");
   }
  }
 }
}
