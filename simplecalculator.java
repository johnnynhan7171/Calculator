import java.util.Scanner;

class Main{
  public static void main(String[] args){
    //variable declaration
    double x, y, result;
    char op;

    //create an object of Scanner class
    Scanner input = new Scanner(System.in);

    //getting values from user
    System.out.println("Enter first number");
    x = input.nextDouble();
    System.out.println("Enter Second number");
    y = input.nextDouble();

    //ask user to enter operation
    System.out.println("Enter operator: (+, -, *, /)");
    op = input.next().charAt(0);

    //performing specified operation
    switch(op){
      case '+':
        result = x + y;
        System.out.println("The sum:" + result);
        break;
      case '-':
        result = x - y;
        System.out.println("The difference:" + result);
        break;
      case '*':
        result = x * y;
        System.out.println("The product:" + result);
        break;
      case '/':
        result = x / y;
        System.out.println("The quotient:" + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
    input.close();
  }
}