package me.magurmach.experiments;

import me.magurmach.experiments.GlobalExceptionHandler;

/**
 * Created by sheikahm on 1/23/17.
 */
public class MainClass {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());
        TestClass testClass1 = new TestClass(null);
        TestClass testClass2 = new TestClass("asd");
    }
}