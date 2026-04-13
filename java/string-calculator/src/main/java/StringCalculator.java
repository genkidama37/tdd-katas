import static java.lang.IO.println;

// Ref: https://osherove.com/tdd-kata-1
// TODO:
//  - Test with negative integers
public class StringCalculator {
    public static int add(String numbers){
        if (numbers.length() == 0) return 0;

        String[] singleNumbers = numbers.split(",");
        //noinspection ReassignedVariable
        int result = 0;
        for (int i = 0; i < singleNumbers.length ; i++) {
            result += Integer.parseInt(singleNumbers[i]);
        }
        return result;
    }
}
