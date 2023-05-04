/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rekursif;

/**
 *
 * @author LENOVO
 */
public class Rekursif {

    // Method rekursif sederhana
  public static void countDown(int n) {
    if (n == 0) {
      System.out.println("DUAAAAAR!!!");
    } else {
      System.out.println(n);
      countDown(n-1);
    }
  }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        countDown(5);
    }
    
}
