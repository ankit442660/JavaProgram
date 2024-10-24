class A {
    private int x;
    int y;

    public void f1() {
        System.out.print("\n parent A");
        x = 5;
        y = 10;
        System.out.print("\n X=" + x);
        System.out.print("\n Y=" + y);
    }
}

class B extends A {
    private int m;
    int p;

    public void f2() {
        System.out.print("\n intermediate parent b");
        y = 20;
        m = 30;
        p = 40;
        System.out.print("\n y=" + y);
        System.out.print("\n m=" + m);
        System.out.print("\n p=" + p);
    }
}

class C extends B {
    public void f3() {
        System.out.print("\n child c");
        p = 50;
        y = 40;
        System.out.print("\n y=" + y);
        System.out.print("\n P=" + p);

    }
}

public class multilevel {
    public static void main(String args[]) {
        A a1 = new A();
        a1.f1();
        B b1 = new B();
        b1.f1();
        b1.f2();
        C c1 = new C();
        c1.f1();
        c1.f2();
        c1.f3();
    }
}