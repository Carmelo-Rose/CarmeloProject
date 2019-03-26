package test;

/**
 * 内部類
 */
public class App {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.print();
    }

}

class Outer {
    static class Inner {
        private String str = "新内部類";

        public void print() {
            System.out.println(str + "方法");
        }
    }

    public void fun() {
        Inner inner = new Inner();
        System.out.println(inner.str);
    }
}
