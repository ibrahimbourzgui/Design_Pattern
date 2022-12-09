package test;

import entities.Singleton;
import entities.ThreadedTask;

public class Main {
    public static void main(String[] args) {
        //Singleton s= Singleton.getInstance();
        for (int i = 0; i < 5; i++) {
            //s.traiter("T"+i);
            ThreadedTask task = new ThreadedTask("T"+i);
            task.start();
        }
    }
}
