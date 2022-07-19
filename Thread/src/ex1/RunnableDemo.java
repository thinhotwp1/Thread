/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import static java.lang.Thread.sleep;

public class RunnableDemo implements Runnable{
    
    private String name;

    public RunnableDemo(String name) {
        this.name = name;
    }

    
    

    @Override
    public void run() {
        System.out.println(name+" START");
        for(int i=0;i<5;i++){
            System.out.println(i+" "+name);
            try{
                Thread.sleep(1500); //1.5s
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(name+" STOP");
    }
    
}
