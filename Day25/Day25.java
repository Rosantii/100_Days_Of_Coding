
package day9;
import java.util.HashMap;
public class Day25 {
    public static void main(String[] args) {
        //membuat objek hashmap
        HashMap<Integer,String>Hari=new HashMap<Integer,String>();
        
        //Mengisi nilai ke objek hari
        Hari.put(1,"Senin");
        Hari.put(2,"Selasa");
        Hari.put(3,"Rabu");
        Hari.put(4,"Kamis");
        Hari.put(5,"Jumat");
        Hari.put(6,"Sabtu");
        Hari.put(7,"Minggu");
        
        //Mencetak semua isi dari objek Hari
        System.out.println("Isi objek Hari : "+Hari);
        
        //Mengambil nilai dari HashMap (mengambil hari senin)
        System.out.println("Hari pertama : "+Hari.get(1));
        
        //Menghapus nilai daari HashMap (hapus hari selasa)
        //Remove() menghapus salah satu nilai
        Hari.remove(2);
        System.out.println("Isi objek Hari : "+Hari);
        
        //Clear() menghapus semua nilai
        Hari.clear();
        System.out.println("Isi objek Hari : "+Hari);
      

    }
}

    

