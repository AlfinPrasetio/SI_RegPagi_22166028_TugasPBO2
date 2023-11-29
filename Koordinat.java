/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan54.koordinat;

/**
Nama     : Alfin Prasetio
Nim      : 22166028
Prodi    : Sistem informasi
Semester : 3
 */
    public class Koordinat {
  private String warna;
  private int x;
  private int y;
  
  public Koordinat(String warna, int x, int y) {
    this.warna = warna;
    this.x = x;
    this.y = y;
  }

  public String getWarna() {
    return warna;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "Koordinat{" +
        "warna='" + warna + '\'' +
        ", x=" + x +
        ", y=" + y +
        '}';
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Koordinat koordinat = new Koordinat("Jingga", 10, 4);

    System.out.println("Warna Koordinat: " + koordinat.getWarna());
    System.out.println("Koordinat Sumbu x: " + koordinat.getX());
    System.out.println("Koordinat Sumbu y: " + koordinat.getY());
  }
}
