package com.bressan.inheritance;

class Bird extends Animal implements Fly {

}

interface Fly {

}

class Animal {

}

class Main {
    static Animal a = new Bird();

    public static void main(String[] args) {
        System.out.println(a instanceof Fly);
    }
}
