/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asincrona;

/**
 *
 * @author Yojayro
 */
public class Secuencial {
    public static void main(String[] args) {
        
        tarea1();
        tarea2();
        tarea3();
    
    
    }
    
public static void tarea1() {
        for (int i=0; i<5; i++) {
            System.out.println("Tarea 1: "+i);
        }
}
public static void tarea2() {
        for (int i=0; i<5; i++) {
            System.out.println("Tarea 2: "+i);
        }
}
public static void tarea3() {
        for (int i=0; i<5; i++) {
            System.out.println("Tarea 3: "+i);
        }
}
}
