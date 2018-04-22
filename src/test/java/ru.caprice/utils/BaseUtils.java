package ru.caprice.utils;

import java.util.Random;

public class BaseUtils {

    public static int getRandomElement(int size){
        Random random = new Random();
        return random.nextInt(size);
    }
}
