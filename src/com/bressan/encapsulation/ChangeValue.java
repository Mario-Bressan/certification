package com.bressan.encapsulation;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        change(arr[2]);
        change(arr);
        System.out.println(arr[1] + arr[2]);
    }

//    primitive arguments are passe by value
//    any changes to the values of the parameters exist only within
//    the scope of the method
    public static void change(int x) {
        x = 1;
    }

//    reference data type parameters, such as objects, are also passed into method by value.
//    this means that when method returns, the passed-in reference still
//    references the same object as before.
//    However, the values of the object fields can be changed in the method.
    public static void change(int arr[]) {
        arr[1] = 0;
    }
}
