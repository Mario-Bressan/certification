package com.bressan.inheritance;

class Base {
    public int n = 1;

    public int getN() {
        System.out.println("Base " + n);
        return n;
    }
}

public class Derived extends Base {
    public  int n = 2;

    @Override
    public int getN() {
        System.out.println("Derived " + n);
        return n;
    }

    public static void main(String[] args) {
        Base b = new Derived();
        System.out.println(b.n + " " + b.getN());

        Derived d = (Derived) b;
        System.out.println(d.n + " " + d.getN());
//        prints
//        Derived 2
//        1 2
//        Derived 2
//        2 2
    }
}
//Aqui, b refere se a um objeto da classe Derived, logo b.getN() chamara sempre o metodo sobrescrito (subclass method).
//Entretanto, o tipo de referencia de b eh Base, logo b.n refere se ao n da classe Base.
//Adiante, dentro da classe Derived, getN() vai acessar n de Derived em vez de n da Base class
//por que estamos acessando this ('this' eh implicito)  e o tipo do this eh Derived.