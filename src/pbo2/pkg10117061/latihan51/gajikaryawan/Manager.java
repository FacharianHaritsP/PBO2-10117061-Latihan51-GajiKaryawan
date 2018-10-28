/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan51.gajikaryawan;
/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menghitung Gaji karyawan
 * 
 */
public class Manager extends Karyawan {

    private int kehadiran;
    private float tunjunganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        this.kehadiran = hadir;
        return hadir * 10000;
    }

    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equals("manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equals("kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }

        return tunjanganJabatan;
    }

    public float tunjanganGolongan(int golongan) {
        if (golongan == 1) {
            tunjunganGolongan = 500000;
        } else if (golongan == 2) {
            tunjunganGolongan = 1000000;
        } else if (golongan == 3) {
            tunjunganGolongan = 1500000;
        } else {
            golongan = 0;
        }

        return tunjunganGolongan;
    }

    public float gajiTotal() {

        return tunjanganJabatan + tunjanganKehadiran(kehadiran)+ tunjunganGolongan;
    }
}
