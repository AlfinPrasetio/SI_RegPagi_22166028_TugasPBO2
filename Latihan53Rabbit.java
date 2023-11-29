/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan53.rabbit;

/**
Nama     : Alfin Prasetio
Nim      : 22166028
Prodi    : Sistem informasi
Semester : 3
 */
public class Latihan53Rabbit {
    public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}
    
    public class Rabbit extends Animal {
    private String name;
    private String color;

    public Rabbit(String name, boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Rabbit peter = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is Peter");
        System.out.println("Peter is Vegetarian? " + peter.isVegetarian());
        System.out.println("Peter eats " + peter.getEats());
        System.out.println("Peter has " + peter.getNoOfLegs() + " legs");
        System.out.println("Peter color is " + peter.getColor());
    }
}