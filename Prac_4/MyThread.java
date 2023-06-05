package Prac_4;

public class MyThread implements Runnable{
    private String name;

    MyThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        try{
            System.out.println("Имя: " + name);
            Thread.sleep((long)(Math.random()*1000));
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}