
package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Bai1 {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
                int t=1;
                while(true){
                    t=t+1;
                    System.out.println("\33[31m"+f.format(new Date()));
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                    if(t==10){
                        break;
                    }
                }
            }
        }.start();
    }
}
