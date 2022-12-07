import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {
  public static void main(String[] args) {
    Set<Integer> nilai = new TreeSet<>();

    nilai.add(87);
    nilai.add(89);
    nilai.add(73);
    nilai.add(90);
    nilai.add(76);
    nilai.add(55);
    nilai.add(37);
    nilai.add(0);
    nilai.add(70);

    System.out.println(nilai);
  }
}
