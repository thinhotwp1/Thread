/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so giay:");
        n=Integer.parseInt(sc.nextLine());
        
        Thread1 t1 = new Thread1(n);
        Thread2 t2 = new Thread2(n);
        System.out.println("T1 START!!");
        System.out.println("T2 START!!");
        t1.start();  
        t2.start();
    }
}
