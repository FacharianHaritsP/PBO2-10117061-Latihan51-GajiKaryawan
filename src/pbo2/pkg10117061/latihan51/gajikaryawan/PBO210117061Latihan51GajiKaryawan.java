/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menghitung Gaji karyawan
 * 
 */
public class PBO210117061Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager mng = new Manager();
        Scanner sca = new Scanner(System.in);

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan Nik : ");
        mng.nik = sca.nextLine();
        System.out.print("Masukkan Nama : ");
        mng.nama = sca.nextLine();
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mng.jabatan = sca.nextLine();
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mng.golongan = sca.nextInt();
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mng.setKehadiran(sca.nextInt());

        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK : " + mng.getNik());
        System.out.println("Nama : " + mng.getNama());
        System.out.println("Golongan : " + mng.getGolongan());
        System.out.println("Jabatan : " + mng.getJabatan());
        System.out.println("\nTunjangan Golongan : "
                + mng.tunjanganGolongan(mng.golongan));
        System.out.println("Tunjangan Jabatan : "
                + mng.tunjanganJabatan(mng.jabatan));
        System.out.println("Tunjangan Kehadiran : "
                + mng.tunjanganKehadiran(mng.getKehadiran()));
        System.out.println("Total gaji : " + mng.gajiTotal());

    }

}
