package ru.netology.javaqa.javamvn.services;

public class SqrtService {
    public int sqrt(int y) {
        int i;
        for (i = 0; i <= y; i++) {
            if (i * i >= y) {
                return i;
            }
        }
        return -1;
    }
}
