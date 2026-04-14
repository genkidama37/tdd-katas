import static java.lang.IO.println;

// Ref: https://osherove.com/tdd-kata-1
// TODO:
//  - Allow the Add method to handle an unknown amount of numbers
public class StringCalculator {
    public static int add(String numbers){
        if (numbers.length() == 0) return 0;
        if (numbers.length() == 1) return Integer.parseInt(numbers);

        String[] singleNumbers = numbers.split(",");
        return Integer.parseInt(singleNumbers[0]) + Integer.parseInt(singleNumbers[1]);
        //noinspection ReassignedVariable
        //(int result = 0;
//        for (int i = 0; i < singleNumbers.length ; i++) {
//            result += Integer.parseInt(singleNumbers[i]);
//        }
//        return result;
    }
}
