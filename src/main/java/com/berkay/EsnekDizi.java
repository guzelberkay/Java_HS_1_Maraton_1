package com.berkay;

public class EsnekDizi {
    private int[] dizi;
    private int uzunluk = 0;

    public void Add(int eleman) {
        uzunluk++;
        if (uzunluk == 1) {
            dizi = new int[1];
            dizi[0] = eleman;
        } else {
            int[] geciciDizi = new int[uzunluk];
            for (int i = 0; i < dizi.length; i++) {
                geciciDizi[i] = dizi[i];
            }
            geciciDizi[uzunluk - 1] = eleman;
            dizi = geciciDizi;
        }
    }

    public void remove(int index) {
        uzunluk--;
        int[] geciciDizi = new int[uzunluk];
        int deger = 0;
        for (int i = 0; i < uzunluk+1; i++) {
            if (i == index) {
                deger++;
                continue;
            }
            geciciDizi[i - deger] = dizi[i];
        }
        dizi = geciciDizi;
    }

    public void add(int index, int eleman) {
        int[] geciciDizi = new int[uzunluk + 1];
        for (int i = 0; i < index; i++) {
            geciciDizi[i] = dizi[i];
        }
        geciciDizi[index] = eleman;
        for (int i = index + 1; i < geciciDizi.length; i++) {
            geciciDizi[i] = dizi[i - 1];
        }
        dizi = geciciDizi;
    }

    public int[] listele() {
        return dizi;
    }
}

 //class sonu.
