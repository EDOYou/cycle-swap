package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {

    static void cycleSwap(int[] array) {

        int[] auxArr = new int[array.length];

        if (array.length != 0) {
            auxArr[0] = array[auxArr.length - 1];
            int cnt = 1;
            for (int i = 0; i < array.length - 1; i++) {
                auxArr[cnt] = array[i];
                cnt++;
            }
        }
        System.arraycopy(auxArr,0,array,0,auxArr.length);
    }

    static int[] cycleSwap2(int[] array) {

        int[] auxArr = new int[array.length];
        auxArr[0] = array[auxArr.length - 1];
        int cnt = 1;
        for (int i = 0; i < array.length - 1; i++) {
            auxArr[cnt] = array[i];
            cnt++;
        }
        System.arraycopy(auxArr,0,array,0,auxArr.length);
        return array;
    }

    static void cycleSwap(int[] array, int shift) {

        if (array.length != 0) {
            if (shift != 0)
                cycleSwap(cycleSwap2(array),shift - 1);
        }
    }
}
