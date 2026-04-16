import static java.lang.IO.println;

// Ref: https://osherove.com/tdd-kata-1
// TODO:
// Support different delimiters
//        to change a delimiter, the beginning of the string will contain a separate line that
//        looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three
//        where the default delimiter is ‘;’ .
//        the first line is optional. all existing scenarios should still be supported
public class StringCalculator {
    public static int add(String numbers){
        if (numbers.length() == 0) return 0;
        String[] singleNumbers = numbers.split("[\n,]");

        //noinspection ReassignedVariable
        int result = 0;
        for (int i = 0; i < singleNumbers.length ; i++) {
            result += Integer.parseInt(singleNumbers[i]);
        }
        return result;
    }
}
