/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programapernas.programapernas;

import java.util.Scanner;

/**
 *
 * @author Jefferson
 */
public class ProgramaPernas {

    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas ?");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        switch (perna){
            case 1: 
                tipo = "Saci";
                break;
            case 2: 
                    tipo = "Bipede";
                break;
            case 3:   
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6: 
                tipo = "Aranha";
                 break;
            default:
                 tipo = "ET";
                 break;
        }
        System.out.println(tipo);
    }
}
