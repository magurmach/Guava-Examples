package me.magurmach.experiments;

/**
 * Created by sheikahm on 1/23/17.
 */
public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.toString() + " raised exception:");
        e.printStackTrace();
    }
}