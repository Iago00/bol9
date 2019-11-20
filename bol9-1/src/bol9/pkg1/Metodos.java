/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9.pkg1;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);
    int num;

    public int pedirDato() {
        num = sc.nextInt();
        return num;
    }

    public void contarPosNegCer() {
        int cont = 0, n = 0, p = 0, c = 0;
        while (cont < 10) {
            num = pedirDato();
            if (num < 0) {
                n++;
            } else if (num > 0) {
                p++;
            } else {
                c++;
            }
            cont++;
        }
        System.out.println("Positivos " + p + " Negativos " + n + " Ceros " + c);

    }

}
