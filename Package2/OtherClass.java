package Package2;

public class OtherClass {
    public void method1() {
        ClassB traigoB = new ClassB();
        // traigoB.privateMethod();  private only works for members of its OWN class. PERIOD.
        traigoB.protectedMethod(); // accessible from other classes in the SAME PACKAGE.
        traigoB.packageProtected();
            
        }
    }

