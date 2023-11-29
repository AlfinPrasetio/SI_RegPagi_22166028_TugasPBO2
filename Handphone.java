/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan55.handphone;

/**
Nama     : Alfin Prasetio
Nim      : 22166028
Prodi    : Sistem informasi
Semester : 3
 */

    public abstract class Handphone {
        private final String manufaktur = "Xiaomi";
    private final String os = "Android";
    private final String model = "Flagship";
    private final int harga = 6000000;
    private final String androidKeyStore = "Palaraya71";

    public void displayProduct() {
        System.out.println("Manufaktur: " + manufaktur);
        System.out.println("OS: " + os);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        System.out.println("Android Key Store: " + androidKeyStore);
    }

    public static void main(String[] args) {
        Handphone hp = new Handphone() {};
        hp.displayProduct();
    }
}