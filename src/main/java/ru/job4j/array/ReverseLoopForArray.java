package ru.job4j.array;

public class ReverseLoopForArray {
    public static String printEvenInds(int[] numbers) {
        String ln = System.lineSeparator();
        String res = "Элементы массива с чётными индексами, начиная с последнего: " + ln;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers.length % 2 != 0 && i % 2 == 0 || numbers.length % 2 == 0 && i % 2 != 0) {
                res += numbers[numbers.length - 1 - i] + ln;
            }
        }
        return res;
    }
}
