class Pegawai {
    private String name;
    private String address;
    private int number;
    public Pegawai(String name, String address, int number){
        System.out.println("Meyusun Pegawai");
        this.name = name;
        this.address = address;
        this.number = number;

    }
    public void mailCheck(){
        System.out.println("Memeriksa surat untuk "+ this.name+" "+ address);

    }
    public String toString(){
        return name + " " + address + " " + number;
    }
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }

    public void sayHay(){
        System.out.println("Pegawai yang manggil nih. Halo"+name);
    }
}

class Gaji extends Pegawai{
    private double salary;
    public Gaji(String name, String address, int number, double salary){
        super(name, address, number);
        setSalary(salary);
    }

    @Override
    public void mailCheck(){
        System.out.println("Memeriksa gaji dalam surat");
        System.out.println("Surat tertuju untuk "+ getName()+ " dengan gaji "+salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary=newSalary;
        }
    }
    public double computePay(){
        System.out.println("Menghitung pembayaran gaji untuk "+getName());
        return salary/52;
    }

    @Override
    public void sayHay(){
        System.out.println("Tukang gaji nih. Hai "+super.toString());
    }
}

public class VirtualDemo {
    public static void main(String[] args) {
        
        Gaji s = new Gaji("Wahyu", "Kubar", 3, 5000.00); //bikin objek gaji
        Pegawai e = new Gaji("ini Nama", "Samarinda", 2, 2500.00); // upcasting
        //baris 70 adalah polymorphism dari class Pegawai
        /*Output dari program tersebut karena dalam konstruktor gaji terdapat kode super yang mengakses 
        konstruktor pada parent class. Oleh karena itu, kalimat "Menyusun pengawai" ditampilkan
        dua kali dalam output */
        System.out.println("Memanggil mailCheck Berdasaran Referensi Gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan referensi Pegawai --");
        e.mailCheck();
    }
}
