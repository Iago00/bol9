/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9.pkg3;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Area {
  private float base;
    private float altura;
    private float area;
    Scanner sc = new Scanner(System.in);

    public void calcular() {
        do {
            System.out.println("Altura");
            altura = sc.nextFloat();
        } while (altura < 0);
        do {
            System.out.println("Base");
            base = sc.nextFloat();
        } while (base < 0);

        area = altura * base;
        System.out.println(area);
        

    }
}
