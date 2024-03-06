package com.java.mostwanted;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] v = new int[]{8,2,6,1,5,7,3,4};
        quickSort(v, 0, v.length -1);

        System.out.println(Arrays.toString(v));
    }

    public static void quickSort(int[] v, int start_pos, int end_pos){
        var pivot = v[start_pos];
        int l = start_pos;
        int r = end_pos;

        while (l <= r){

            while (v[l] < pivot) l++;
            while (v[r] > pivot) r--;

            if(l <= r){
                int ls = v[l];
                v[l] = v[r];
                v[r] = ls;

                l++;
                r--;
            }
        }
        if(start_pos < r)quickSort(v, start_pos, r);
        if(l < end_pos)quickSort(v, l, end_pos);

    }
}
