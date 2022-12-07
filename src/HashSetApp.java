import java.util.*;

class HashSetApp {
    public static void main(String[] args) throws Exception {
        Set<String> nama = new HashSet<>();

        /* menambah data dengan method add() */
        nama.add("angga");
        nama.add("angga");
        nama.add("bima");
        nama.add("Budi");
        nama.add("zidan");
        nama.add("zidan");
        nama.add("Budi");
        nama.add("eca");

        System.out.println(nama);

        /* addAll() untuk menambah banyak data sekaligus */
        // nama.addAll(List.of("ani", "bayu", "cika"));

        // System.out.println(nama);

        /* contains() untuk mengecek apakah data spesifik terdapat atau tidak */
        // Boolean cek = nama.contains("angga");
        // System.out.println(cek);

        /* containALl() untuk mencari banyak data spesifik tersedia atau tidak */
        // Boolean cek2 = nama.containsAll(List.of("ani", "bayu", "cika"));
        // System.out.println(cek2);

        /* remove() untuk menghapus satu data spesifik */
        // nama.remove("zidan");
        // System.out.println(nama);

        /* removeAll() menghapus banyak data spesifik sekaligus */
        // nama.removeAll(List.of("ani","bayu","cika"));
        // System.out.println(nama);

        /*
         * retainAll() berfungsi untuk mengembalikan elemen yang sama dalam daftar
         * tersebut
         */
        // Set<String> nama1 = new HashSet<>();

        // nama1.addAll(List.of("angga", "cika","bims"));
        // nama.retainAll(nama1);

        /*
         * retainAll() pada baris 45 akan membuat
         * data yang tersisa di nama adalah data yang terdapat di nama1
         */

        // System.out.println(nama);
        // System.out.println(nama1);

        /* size() untuk menghitung banyak data yang ada */
        // int size = nama.size();
        // System.out.println(size);

        /* clear() untuk menghapus semua data */
        // nama.clear();
        // System.out.println(nama);

    }
}
