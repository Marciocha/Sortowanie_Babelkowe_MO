package com.sdajava.sortowanie_babelkowe;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tab = {4, 7, 8, 3, 5, 4};
        int[] tab2 = {4, 7, 8, 3, 5, 4};
        int[] tab3 = {4, 7, 8, 3, 5, 4};
        boolean flag = true;

        //przesuniecie na koniec

        for (int i = 0; i < tab.length - 1; i++) {
            int tmp = tab[i];
            tab[i] = tab[i + 1];
            tab[i + 1] = tmp;
        }

        System.out.println("Przesuniecie na koniec:");
        System.out.println(Arrays.toString(tab));

        //sortowanie parami

        for (int i = 0; i < tab2.length; i += 2) {

            int tmp = tab2[i];
            tab2[i] = tab2[i + 1];
            tab2[i + 1] = tmp;

        }
        System.out.println("Zamiana parami:");
        System.out.println(Arrays.toString(tab2));

        //sortowanie babelkowe

        for(int j = 0; j<tab3.length - 1; j++) {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab3[i] > tab3[i + 1]) {

                    int tmp = tab3[i + 1];
                    tab3[i + 1] = tab3[i];
                    tab3[i] = tmp;
                }
                flag = false;
            }
            if (flag) break;
        }
                System.out.println("Sortowanie babelkowe:");
                System.out.println(Arrays.toString(tab3));
    }
}


