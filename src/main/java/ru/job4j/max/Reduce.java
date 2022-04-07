package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] thisArray) {
        array = thisArray;
    }

    public void print() {
        for (int element: array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}