/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perbaiki;

/**
 *
 * @author LENOVO
 */
class character{
    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;
    // membuat constructor
    character(String nama, int heal, String weapon, int attackp, int mana){ 
       this.nama = nama;
        this.heal = heal; 
        this.weapon = weapon;
        this.attackP = attackp;
        this.mana= mana;
    }
    
    void attack(){
        mana -=5; 
        System.out.println(this.nama+" melakukan serangan!");
        // system.out.println("sotong terkena demage sebanyak "+this.attackP );

    }
    
    void damage(int attackP){
        System.out.println(this.nama+" terkena damage sebanyak " + attackP);
        this.heal -= attackP;
    }
    void print(){
        System.out.println("nama: "+nama);  
        System.out.println("heal: "+ heal);
        System.out.println("weapon: "+weapon);
        System.out.println("attack power: " +attackP);
        System.out.println("mana : " +mana);
    }
}

/**
 *
 * @author LENOVO
 */
public class Perbaiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        character character1 = new character("ucup",100,"pedang excalibur",5,100);
        character character2 = new character("sotong",100,"golok",7,100);
        character1.attack();
        character2.damage(character1.attackP);
        character2.print();
        character2.attack();
        character1.damage(character2.attackP);
        character1.print();
    }
    }

