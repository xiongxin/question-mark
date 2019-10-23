package com.xiongxin.sample;

public class Dispatch {

    class A {
        void m1() {
            System.out.println("A's m1()");
        }
    }

    class B extends A {
        void m1() {
            System.out.println("B's m1()");
        }
    }

    class C extends A {
        void m1() {
            System.out.println("C's m1()");
        }
    }

    public static void main(String[] args) {
        Dispatch dispatch = new Dispatch();

        A a = dispatch.new A();
        B b = dispatch.new B();
        C c = dispatch.new C();

        A ref;

        ref  = a;
        a.m1();

        ref = b;
        b.m1();

        ref = c;
        c.m1();
    }
}
