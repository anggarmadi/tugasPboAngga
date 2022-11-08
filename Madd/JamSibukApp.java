public class JamSibukApp {
  public static void main(String[] args) {
    Elemen a = new Asdos("Fairuzikun", 24, 1);
    Elemen b = new Dosen("Raja OP Damanik", 5);
    Elemen c = new Asdos("Angel Chan", 20, 4);
    Elemen d = new Mahasiswa("Firman", 20);
    Elemen e = new Mahasiswa("Nid to pass this sem", 23);
    Elemen f = new Dosen("Nivotko", 3);    
    a.cekJamSibuk();
    b.cekJamSibuk();
    c.cekJamSibuk();
    d.cekJamSibuk();
    e.cekJamSibuk();
    f.cekJamSibuk();
    int totalJamSibuk = a.getJamSibuk()+b.getJamSibuk()+c.getJamSibuk()+d.getJamSibuk()+e.getJamSibuk()+f.getJamSibuk();
    System.out.println("Total jam sibuk elemen Fasilkom adalah "+totalJamSibuk);
    
    
  }
}
