package com.bressan.inheritance.overriden.ex1;

class Person {
    int age;
    String name;
    public void read() {
        System.out.println("Person is reading");
    }
    private void other() {

    }
}

class Livera extends Person {
    Livera(String s, int i) {
        age = i;
        name = s;
    }
    public void read() {
        System.out.println(name + " is reading");
    }
    public void other() throws Exception {}
}

public class Overriding {
    public static void main(String[] args) {
        Livera s = new Livera("Livera", 22);
        Person p = s;
        s.read();
        p.read();
//        prints:
//        Livera is reading
//        Livera is reading

        // overridden method is executed from
        // object class (right side), not from reference class (left side)
        // different from overloaded method
    }
}
