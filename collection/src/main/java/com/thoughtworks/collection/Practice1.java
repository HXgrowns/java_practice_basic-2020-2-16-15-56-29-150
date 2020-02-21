package com.thoughtworks.collection;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     * 生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        List<Integer> intDatas = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            intDatas.add(i);
        }
        Collections.shuffle(intDatas);
        return intDatas.subList(0, 10);
    }
}
