import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetApp {
  public static void main(String[] args) {
    SortedSet<Integer> nilai = new TreeSet<>();

    nilai.add(87);
    nilai.add(89);
    nilai.add(73);
    nilai.add(90);
    nilai.add(76);
    nilai.add(55);
    nilai.add(37);
    nilai.add(10);
    nilai.add(70);

    var a = nilai.subSet(10, 70);
    System.out.println(nilai);
    System.out.println(a);
    /*
     * Method yang bisa untuk Sorted Set
     * comparator() -> untuk membandingkan 2 data
     * subSet(E,F) -> mengambil nilai lebih besar atau sama dengan E dan kecil dari F
     * headSet(E) -> mengambil nilai yang kecil atau sama dengan E
     * tailSet(E) -> mengambil nilai yang lebih besar dari E
     * first(E) -> Melihat data pertama setelah di urutkan
     * last(E) -> Melihat data terakhir setelah di urutkan
     */
  }
}
