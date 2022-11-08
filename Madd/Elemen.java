public class Elemen {
  private String nama;
  public  Elemen(String nama){
    this.nama=nama;
  }

  public String toString(){
    return nama;
  }
  public int getJamSibuk(){
    return 0;
  }
  public void cekJamSibuk(){

  }
}

class Dosen extends Elemen{
  private int jumlahHariKerja;
  public Dosen(String nama, int jumlahHariKerja){
    super(nama);
    setJumlahHariKerja(jumlahHariKerja);
  }

  public int getJamSibuk(){
    return jumlahHariKerja*8;
  }

  public void cekJamSibuk(){
    System.out.println(super.toString()+" adalah seorang Dosen dengan jam sibuk "+getJamSibuk());
  }

  public void setJumlahHariKerja(int newJumlahHariKerja){
    if(newJumlahHariKerja>0){
      jumlahHariKerja=newJumlahHariKerja;
    }
  }
}

class Mahasiswa extends Elemen{
  private int sks;
  int jamSibuk=sks*3;
  public Mahasiswa(String nama, int sks){
    super(nama);
    setSks(sks);
  }

  public int getJamSibuk(){
    return sks*3;
  }

  public void cekJamSibuk(){
    System.out.println(super.toString()+" adalah seorang Mahasiswa dengan jam sibuk "+getJamSibuk());
  }

  public void setSks(int newSks){
    if(newSks>0){
      sks=newSks;
    }
  }
  
}

class Asdos extends Mahasiswa{
  private int jamNgasdos;

  public Asdos(String nama, int sks, int jamNgasdos){
    super(nama, sks);
    setJamNgasdos(jamNgasdos);
  }

  public int getJamSibuk(){
    return jamNgasdos+super.getJamSibuk();
  }

  public void cekJamSibuk(){
    System.out.println(super.toString()+" adalah seorang Asdos dengan jam sibuk "+getJamSibuk());
  }

  public void setJamNgasdos(int newJamNgasdos){
    if(newJamNgasdos>0){
      jamNgasdos = newJamNgasdos;
    }
  }
  
}