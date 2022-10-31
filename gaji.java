 import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {

    String karyawan;
    int masakerja;
    int golongan = 2;
    int gapok = 0;
    int tunjangan = 0;

    Scanner myObj = new Scanner(System.in);

    // Enter username and press Enter
    System.out.println("Masukkan nama karyawan : "); 
    karyawan = myObj.nextLine();   

    System.out.println("Masukkan golongan : ");
    golongan = myObj.nextInt();
    
    System.out.println("Masukkan masa kerja : ");
    masakerja = myObj.nextInt();

    System.out.println();   

    if (golongan==1){
        gapok = 2500000;
    } else if (golongan==2) {
        gapok = 4000000;
    } else if (golongan==3) {
        tunjangan = 1500000;
    } else {
        System.out.println("Hanya ada 3 golongan");
    }

    if (masakerja >= 10) {
        tunjangan = 4000000;
    } else if (masakerja > 5 && masakerja <= 9) {
        tunjangan = 300000;
    } else if (masakerja <= 5) {
        tunjangan = 1500000;
    } else {
        System.out.println("ERRORRRRS");
    }
    

    int potonggaji = (tunjangan +10)/100;

    int totalgaji = gapok + (tunjangan - potonggaji);

    System.out.println("Gaji pokok : " + gapok);
    System.out.println("Tunjangan : " + tunjangan);
    System.out.println("Total gaji : " + totalgaji);
    }
}
