import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashApp {
  public static void main(String[] args) {
    // Set<String> angka = new HashSet<>();
    Set<String> angka = new LinkedHashSet<>();

    angka.add("Satu");
    angka.add("Dua");
    angka.add("Tiga");
    angka.add("Empat");

    System.out.println(angka);

    /*
     * Untuk method yang dapat digunakan pada LinkedHashSet
     * sama saja dengan yang dapat digunakan pada HashSet
     * karena sama sama merupakan turunan dari collection
     */

  }
}
