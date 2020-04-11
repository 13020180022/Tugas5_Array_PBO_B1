import java.util.Vector;

class vector { 
    public static void main (String[] args){
        Vector<Integer> deret = new Vector<Integer>();

        System.out.println("Panjang deret awal: "+deret.size());

        for (int i = 0; i < 5; i++){
            deret.add(i * 5);
        }

        System.out.println("\nPanjang deret setelah ditambah elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }

        System.out.println("\nMemeriksa apakah vector kosong: ");
        System.out.println(deret.isEmpty());    

        System.out.println("\nMencari indeks dari suatu nilai di dalam vector: ");
        System.out.println(deret.indexOf(20));  
        System.out.println(deret.indexOf(11));  
        System.out.println(deret.indexOf(15));  

        System.out.println("\nMemeriksa keberadaan suatu nilai di dalam vector: ");
        System.out.println(deret.contains(20)); 
        System.out.println(deret.contains(11)); 
        System.out.println(deret.contains(15)); 

        System.out.println("\nMencari elemen pertama dan terakhir di dalam vector: ");
        System.out.println(deret.firstElement());   
        System.out.println(deret.lastElement());    

        }
    }
