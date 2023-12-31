package SortingService.impl;

import SortingService.SortingAlgorithm;

public class BubbleSortAlgorithm implements SortingAlgorithm {
    @Override
    public void sort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            boolean isChanged= false;
            for (int j = 1; j < input.length-i; j++) {
                if(input[j] < input[j-1]){
                    isChanged = true;
                    int temp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = temp;
                }
            }
            if(!isChanged){
                break;
            }
        }
    }
}
