package week2.accessmodifiers.accessmodifiers2;

import week2.accessmodifiers.accessmodifiers1.AccessModifiers;

public class AccessModifiers3 extends AccessModifiers {

    public static void main(String[] args) {

        AccessModifiers.m1();

//        AccessModifiers.m2();

//        AccessModifiers.m3();


        //even if it's in another package it works because protected means
        // it is visible in package + all children classes (explained later)
        AccessModifiers.m4();
    }
}
