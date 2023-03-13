package Package1;

import Package2.ClassB;

public class ClassA {
    public static void main(String[] args) {
        ClassB linktoB = new ClassB();
        linktoB.publicMethod();
        // linktoB.protectedMethod will not work. Not a part of same package.
    }
}
