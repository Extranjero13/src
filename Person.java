
public class Person {

  private String middleName = "Christopher";

  public void sayHello(){
    System.out.println("Hello");
  }

  public void saySomething(String something){
    System.out.println(something);
  }

  public char getMiddleInitial(){
    return middleName.charAt(0);
  }

  public int add(int x, int y){
    return x+y;
  }
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.sayHello();
    p1.saySomething("My groovy message");
    p1.saySomething("yoyoyoyoyo");

    char middleInitial = p1.getMiddleInitial();  // alternative way to call this function  

    System.out.println(p1.getMiddleInitial());
    System.out.println(p1.add(5,3));
    System.out.println(middleInitial);        // alternative way follow-up

  } 
    
} 