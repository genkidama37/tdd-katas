// Ref: https://osherove.com/tdd-kata-1
// TODO:
// The method can take up to two numbers, separated by commas, and will return their sum.
//        for example “” or “1” or “1,2” as inputs.
//        (for an empty string it will return 0)
// Hints:
//        ——————
//        - Start with the simplest test case of an empty string and move to one and two numbers
// - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
// - Remember to refactor after each passing test
public class StringCalculator {
    public static int add(String numbers){
        if (numbers.length() == 0) return 0;
        return Integer.parseInt(numbers);
    }
}
