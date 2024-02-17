package com.berkay;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        EsnekDizi esnekDizi = new EsnekDizi();
        esnekDizi.Add(5);
        esnekDizi.Add(2);
        esnekDizi.Add(3);
        esnekDizi.Add(10);
        System.out.println("Dizi : "+ Arrays.toString(esnekDizi.listele()));
        esnekDizi.add(1,11);
        System.out.println("Dizi : "+ Arrays.toString(esnekDizi.listele()));
        esnekDizi.remove(2); // ikinci index de bulununan sayıyı sildik
        System.out.println("Dizi : "+ Arrays.toString(esnekDizi.listele()));
        
    }
}
