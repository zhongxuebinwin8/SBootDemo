package com.example.designpattern.compositemode;

/**
 * 橡皮鸭
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("橡皮鸭吱吱叫");
    }
}
