package Week2;

import java.util.Arrays;

public class ArraysFrequence {
    static boolean isFind(int [ ]arr,int value){
        for(int i: arr){
            if( i==value){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {


        int[] list = {1, 2, 6, 5, 6, 6, 6, 5, 8, 9, 8};


        int sayac = 0;
        boolean[] found = new boolean[list.length];  //Tekrar aynı sayıları bastırmamak için boolean dizisi oluşturuyoruz.
        for (int i = 0; i < list.length; i++) {
            if (found[i]) {                      //Aynı sayı geldiği zaman döngüyü bir ileri atıyoruz.
                continue;
            }
            for (int k = 0; k < list.length; k++) {
                if (  list[i] == list[k]) {
                    sayac++;            //Sayının dizide kaç adet tekrar ettiğini buluyoruz.
                    found[k] = true;
                }

            }

            System.out.println(list[i]+ " sayısı "+ sayac + " kez tekrar etti.");
 sayac=0;
        }


    }

}