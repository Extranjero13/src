package Package2;
public class ClassB{
    public void publicMethod(){
        System.out.println("This is the public method of ClassB");
        privateMethod();  // notice
    }

    private void privateMethod() {
        System.out.println("This is the private method of ClassB");
    }

    protected void protectedMethod(){
        System.out.println("This is the protected method ClassB");
    }

    void packageProtected(){
        System.out.println("This is the package protected method");
    }
}