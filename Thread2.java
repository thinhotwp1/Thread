/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author Administrator
 */
public class Thread2 extends Thread{
    private int num;

    public Thread2(int num) {
        this.num = num;
    }
    public void run(){
        while(num>=0){
            num--;
            SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
                System.out.println("\33[33m"+f.format(new Date()));
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
}

