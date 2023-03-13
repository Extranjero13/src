import java.time.LocalDate;

public class Person {
  private String firstName;
  private String middleName = "Christopher";
  public String lastName;
  public static Person kate=null;  
  public static double PI = 3.14;
  protected LocalDate dob;

  public static int[] nums;

  static {
    //static init
    nums = new int[5];
    nums[0]=3;
    nums[1]=3;
    nums[2]=3;
    nums[3]=3;
    nums[4]=3;
  }

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

  public void test(int num1, int num2, String[] words){
    // example
  }

  public void test2(int num1, int num2, String... words){
    //do something clever, this uses a varargs. Remember, varargs is ALWAYS last argument.
  }
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.firstName = "Jake";
    p1.lastName = "Smith";
    p1.sayHello();
    p1.saySomething("My groovy message");
    p1.saySomething("yoyoyoyoyo");

    char middleInitial = p1.getMiddleInitial();  // alternative way to call this function  

    System.out.println(p1.getMiddleInitial());
    System.out.println(p1.add(5,3));
    System.out.println(middleInitial);        // alternative way follow-up
    System.out.println(PI);

    String[] words = new String[] {"one", "two", "three"};
    p1.test(3,5,words);
    p1.test2(3,5, "one","two","three");
  } 
    
} 