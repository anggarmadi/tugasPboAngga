//membuat kelas Elemen sebagai parent class
abstract class Elemen {
  private String nama;
  public  Elemen(String nama){
    this.nama=nama;
  }

  public String toString(){
    return nama;
  }
  public abstract int getJamSibuk();
  public abstract void cekJamSibuk();
}

//membuat kelas dosen sebagai sub class dari kelas elemen
class Dosen extends Elemen{
  private int jumlahHariKerja;
  public Dosen(String nama, int jumlahHariKerja){
    super(nama);
    setJumlahHariKerja(jumlahHariKerja);
  }

  @Override
  public int getJamSibuk(){
    return jumlahHariKerja*8;
  }

  @Override
  public void cekJamSibuk(){
    System.out.println(super.toString()+" adalah seorang Dosen dengan jam sibuk "+getJamSibuk());
  }

  public void setJumlahHariKerja(int newJumlahHariKerja){
    if(newJumlahHariKerja>0){
      jumlahHariKerja=newJumlahHariKerja;
    }
  }
}

//membuat kelas mahasiswa sebagai subclass dari elemen
class Mahasiswa extends Elemen{
  private int sks;
  int jamSibuk=sks*3;
  public Mahasiswa(String nama, int sks){
    super(nama);
    setSks(sks);
  }

  @Override
  public int getJamSibuk(){
    return sks*3;
  }

  @Override
  public void cekJamSibuk(){
    System.out.println(super.toString()+" adalah seorang Mahasiswa dengan jam sibuk "+getJamSibuk());
  }

  public void setSks(int newSks){
    if(newSks>0){
      sks=newSks;
    }
  }
  
}

// membuat kela Asdos yang merupakan subclass dari kelas mahasiswa
class Asdos extends Mahasiswa{
  private int jamNgasdos;

  public Asdos(String nama, int sks, int jamNgasdos){
    super(nama, sks);
    setJamNgasdos(jamNgasdos);
  }

  @Override
  public int getJamSibuk(){
    return jamNgasdos+super.getJamSibuk();
  }

  @Override
  public void cekJamSibuk(){
    System.out.println(super.toString()+" adalah seorang Asdos dengan jam sibuk "+getJamSibuk());
  }

  public void setJamNgasdos(int newJamNgasdos){
    if(newJamNgasdos>0){
      jamNgasdos = newJamNgasdos;
    }
  }
  
}


//membuat driver class
public class MenghitungJamSibukApp {
  public static void main(String[] args) {
    Elemen a = new Asdos("Fairuzikun", 24, 1);    //Upcasting
    Elemen b = new Dosen("Raja OP Damanik", 5);  //Upcasting
    Elemen c = new Asdos("Angel Chan", 20, 4);    //Upcasting
    Elemen d = new Mahasiswa("Firman", 20);                   //Upcasting
    Elemen e = new Mahasiswa("Nid to pass this sem", 23);     //Upcasting
    Elemen f = new Dosen("Nivotko", 3);           //Upcasting

    /*Baris ke 96 hingga 101 terlihat beberapa objek dengan tipe elemen namun dengan bentung yang
     * berbeda beda, ada yang sebagai asdos,
     * ada yang sebagai dosen
     * ada yang sebagai mahasiswa
     * macam macam bentuk dari elemen inilah yang disebut sebagai polimorpisme atau banyak bentuk
     */

     // memanggil method ceoJamSibuk() untuk setiap objek
    a.cekJamSibuk();
    b.cekJamSibuk();
    c.cekJamSibuk();
    d.cekJamSibuk();
    e.cekJamSibuk();
    f.cekJamSibuk();

    // menjumlahkan jam sibuk setiap objek yang dibuat
    int totalJamSibuk = a.getJamSibuk()+b.getJamSibuk()+c.getJamSibuk()+d.getJamSibuk()+e.getJamSibuk()+f.getJamSibuk();
    // menampilkan total jam sibuk seluruh objek
    System.out.println("Total jam sibuk elemen Fasilkom adalah "+totalJamSibuk);
    
    
  }
}