package com.company;

public class Main {

    public static void main(String[] args) {
        int nilaiAwal = 5;
        int beda = 5;
        int hasil;

        for (int i=1; i<=5;i++){
            for (int j =i; j<=5; j++){
                hasil = nilaiAwal;
                nilaiAwal+=beda;

                System.out.print(" "+hasil);
            }
            System.out.println(" ");
        }
    }
}
