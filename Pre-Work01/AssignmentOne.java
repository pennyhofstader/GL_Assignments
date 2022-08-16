import java.util.*;;

class AllProblems {

  // checking for prime numbers
  public void isPrime() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Prime Number");
    int num = sc.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (flag == false)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }

  // printing a pattern of stars
  public void pattern() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Number To Print Pattern");
    int number = sc.nextInt();
    // initaiating loop to print pattern
    for (int i = number; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("\n");
    }
  }

  // printing the fibonacci series
  public void fib() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Number To Fib Pattern");
    int fibnum = sc.nextInt(), firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + fibnum + " terms:");

    for (int i = 1; i <= fibnum; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

    }
    System.out.println("\n");

  }

  // checking if the number is palindrome

  public void Ispalindrome() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Number To See If Its A Palindrome Number");

    int PalindromeNum = sc.nextInt(), rnum = 0, remainder;

    // storing the user input in a variable
    int originalNum = PalindromeNum;

    // get the reverse of originalNum
    // store it in variable
    while (PalindromeNum != 0) {
      remainder = PalindromeNum % 10;
      rnum = rnum * 10 + remainder;
      PalindromeNum /= 10;
    }

    // check if reversedNum and originalNum are equal
    if (originalNum == rnum) {
      System.out.println(originalNum + " is a Palindrome number.");
    } else {
      System.out.println(originalNum + " is not a Palindrome number.");
    }

  }

}

public class AssignmentOne {

  public static void main(String[] args) {

    System.out.println("Select the task you want to perform");
    System.out.println("1. Check for palindrome number" + "\n"
        + "2. Prints the pattern of stars in decreasing order based on the input" + "\n"
        + "3. Check whether the input number is a prime number" + "\n"
        + "4. Print Fibonacci series of size n with first two numbers as 0, 1 ");
    AllProblems First = new AllProblems();

    Scanner sb = new Scanner(System.in);
    int task;
    do {
      System.out.println("Enter Number of the task");
      task = sb.nextInt();
      switch (task) {
        case 0:
          task = 0;
          break;
        case 1:
          First.Ispalindrome();
          break;
        case 2:
          First.pattern();
          break;
        case 3:
          First.isPrime();
          break;
        case 4:
          First.fib();
          break;
        default : System.out.println("Please enter a valid number");
        break;

      }
    }

    while (task != 0);
    System.out.println("You have exited the program");
    sb.close();

  }

}
