/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan52.siapa_kamu;

/**
Nama     : Alfin Prasetio
Nim      : 22166028
Prodi    : Sistem informasi
Semester : 3
 */

public class Manusia {
    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void siapaKamu() {
        System.out.println("Saya Manusia ");
    }
    class Dosen extends Manusia {
        private String nip;
        private String mataKuliah;

        public String getNip() {
            return nip;
        }
        public void setNip(String nip) {
            this.nip = nip;
        }
        public String getMataKuliah() {
            return mataKuliah;
        }
        public void setMataKuliah(String mataKuliah) {
            this.mataKuliah = mataKuliah;
        }
        public void mengajarApa() {
            System.out.println("Saya " + nama + " umur " + umur + " tahun sedang mengajar matakuliah " + mataKuliah);
        }
    }
    class Mahasiswa extends Manusia {
        private String kelas;
        private String nim;
        
        public String getNim() {
            return nim;
        }
        public void setNim(String nim){
            this.nim = nim;
        }
        public String getKelas() {
            return kelas;
        }
        public void setKelas(String kelas) {
            this.kelas = kelas;
        }
        public void kelasApa() {
            System.out.println(); 
        }
        @Override
        public void siapaKamu() { //method ini yang akan dipanggil 
            System.out.println("Saya " + nama + " dengan nim " + nim + ", Saya kelas " + kelas);
        }
    }
    public static void main(String[] args) {
        Manusia.Dosen dosen = new Manusia().new Dosen();
        dosen.setNama("Martinelli");
        dosen.setUmur(22);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();

        Manusia.Mahasiswa mahasiswa = new Manusia().new Mahasiswa();
        mahasiswa.setNama("Alfin");
        mahasiswa.setNim("22166028");
        mahasiswa.setKelas("PBO10-K Sistem Informasi");
        mahasiswa.siapaKamu(); 
    }
}