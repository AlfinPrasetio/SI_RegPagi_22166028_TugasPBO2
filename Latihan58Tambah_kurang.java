/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan58.tambah_kurang;

/**
Nama     : Alfin Prasetio
Nim      : 22166028
Prodi    : Sistem informasi
Semester : 3
 */
public class Latihan58Tambah_kurang {
}
   // Kelas Bilangan
class Bilangan {
    private final int x;
    private final int y;

    // Konstruktor dengan x = 3 & y = 4
    public Bilangan() {
        this.x = 3;
        this.y = 4;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

// Kelas SelisihBilangan
class SelisihBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int hasilJumlah = super.getX() + super.getY();
        System.out.println("Hasil Jumlah: " + hasilJumlah);
    }

    public void tampilSelisih() {
        int selisih = super.getX() - super.getY();
        System.out.println("Hasil Selisih: " + selisih);
    }
}

// Kelas JumlahBilangan
class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int hasilJumlah = super.getX() + super.getY();
        System.out.println("Hasil Jumlah: " + hasilJumlah);
    }
}

// Kelas Main untuk menjalankan program
class Main {
    public static void main(String[] args) {
        JumlahBilangan jumlahBilangan = new JumlahBilangan();
        SelisihBilangan selisihBilangan = new SelisihBilangan();

        jumlahBilangan.tampilHasilJumlah();
        selisihBilangan.tampilSelisih();
    }
}