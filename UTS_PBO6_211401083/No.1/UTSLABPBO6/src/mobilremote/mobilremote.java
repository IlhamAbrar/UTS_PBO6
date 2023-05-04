/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobilremote;

import java.util.Scanner;

public class mobilremote{
    private boolean isOn;
    private int speed;
    private int direction;

    /**
     *
     */
    public mobilremote(){
        this.isOn = false;
        this.speed = 0;
        this.direction = 0;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("Mobil menyala.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Mobil dimatikan.");
    }

    public void increaseSpeed() {
        if (this.isOn) {
            if (this.speed < 10) {
                this.speed++;
                System.out.println("Kecepatan sekarang: " + this.speed);
            } else {
                System.out.println("Kecepatan sudah maksimum.");
            }
        } else {
            System.out.println("Mobil harus dinyalakan terlebih dahulu.");
        }
    }

    public void decreaseSpeed() {
        if (this.isOn) {
            if (this.speed > 0) {
                this.speed--;
                System.out.println("Kecepatan sekarang: " + this.speed);
            } else {
                System.out.println("Kecepatan sudah minimum.");
            }
        } else {
            System.out.println("Mobil harus dinyalakan terlebih dahulu.");
        }
    }

    public void turnLeft() {
        if (this.isOn) {
            if (this.direction > -45) {
                this.direction -= 45;
            } else {
                this.direction = 315;
            }
            System.out.println("Mobil belok ke kiri, arah sekarang: " + this.direction + " derajat.");
        } else {
            System.out.println("Mobil harus dinyalakan terlebih dahulu.");
        }
    }

    public void turnRight() {
        if (this.isOn) {
            if (this.direction < 315) {
                this.direction += 45;
            } else {
                this.direction = 0;
            }
            System.out.println("Mobil belok ke kanan, arah sekarang: " + this.direction + " derajat.");
        } else {
            System.out.println("Mobil harus dinyalakan terlebih dahulu.");
        }
    }

    public static void main(String[] args) {
        mobilremote car =new mobilremote();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nyalakan mobil");
            System.out.println("2. Matikan mobil");
            System.out.println("3. Tambah kecepatan");
            System.out.println("4. Kurangi kecepatan");
            System.out.println("5. Belok kiri");
            System.out.println("6. Belok kanan");
                        System.out.println("7. Keluar");
            System.out.print("Pilihan: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    car.turnOn();
                    break;
                case 2:
                    car.turnOff();
                    break;
                case 3:
                    car.increaseSpeed();
                    break;
                case 4:
                    car.decreaseSpeed();
                    break;
                case 5:
                    car.turnLeft();
                    break;
                case 6:
                    car.turnRight();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

