/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author onthi
 */
public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"START");
        for(int i=0;i<5;i++){
            System.out.println(t.getName()+i);
        }
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(t.getName()+" STOP");
//        System.out.println(t.getPriority());
//        System.out.println(t.getState());
//        t.setPriority(10);
//        System.out.println(t.getPriority());

        ThreadDemo t1 = new ThreadDemo("Gio Moi");
        t1.start();
        
        RunnableDemo r = new RunnableDemo("Nhom 7");
        Thread t2 = new Thread(r);
        t2.start();
        
    }
}
