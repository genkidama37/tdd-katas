import static java.lang.IO.println;

// Ref: https://osherove.com/tdd-kata-1
// TODO:
//  Allow the Add method to handle new lines between numbers (instead of commas).
//      - the following input is ok: “1\n2,3” (will equal 6)
//      - the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)
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
