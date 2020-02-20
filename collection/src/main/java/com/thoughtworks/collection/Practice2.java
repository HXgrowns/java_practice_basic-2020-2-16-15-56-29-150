package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {
        //for循环
        List<Integer> numbers = getNumbers();
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("\n----------------------");

        //增强for循环
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n----------------------");

        //迭代器
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n----------------------");
    }

    /**
     * 创建一个List 然后在List中添加0到100整数
     */
    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }
        return numbers;
    }


}
