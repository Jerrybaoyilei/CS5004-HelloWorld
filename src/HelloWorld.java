import java.util.Scanner;

public class HelloWorld {

  public static void main(String [] args){
    /*
    int count = 10;
    for(int i = 0; i<count; i++){
      System.out.println(i + "Hello CS5004");
    }
    */
    age();
  }

  public static void age(){
    System.out.print("Hello! What is your name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    System.out.println("Great to meet you, " + name);
    System.out.print("How old are you? ");
    int age = scanner.nextInt();
    System.out.println(name + ", this year you are " + age + " next year you'll be " + calculateNewAge(age));
  }

  public static int calculateNewAge(int age){
    return age + 1;
  }


}
