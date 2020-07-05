package com.idukelu.design.pattern.java.decorator;

import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;

/**
 * 装饰器样例测试
 *
 * @author duke
 * @date 2020.07.04
 */
public class DecoratorSimulate {

    @SneakyThrows
    public static void main(String[] args) {
        byte[] bytes = {'A', 'B', 'C'};
        LowerCaseInputStream inputStream = new LowerCaseInputStream(new ByteArrayInputStream(bytes));

        int i = 0;
        while ((i = inputStream.read()) != -1) {
            System.err.println((char) i);
        }

    }
}
