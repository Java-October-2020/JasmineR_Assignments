// my answer was
public class FizzBuzzNew {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(2)); 
        }
    public static String fizzBuzz(int number) {
      if(number%3==0 && number%5==0)
      return "FizzBuzz";
   else if(number%3==0)
    return "Fizz";
    else if(number%5==0)
    return "Buzz";
    System.out.println(FizzBuzz, Fizz, Buzz);

    }
}
// the correct answer is 
public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if(number % 5 == 0 && number % 3 == 0)
            return "FizzBuzz";
        if(number % 5 == 0)
            return "Fizz";
        if(number % 3 == 0)
            return "Buzz";
        return Integer.toString(number);
    }
    public static void FizzBuzzTest() {
        for(int i = 0; i < 100; i++) {
            String result = fizzBuzz(i);
            String output = String.format("Number: %d :: Result: %s", i, result);
            System.out.println(output);
        }
    }
}