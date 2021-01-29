import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework3ReplaceNumbers {

    public static void main(String[] args) {

        StringBuilder strBuilder = new StringBuilder();// making our string like in program before
        Random r = new Random();
        int ranNumber;
        for (int i = 0; i < 100; i++) { // string will have limit of 100 symbols
            ranNumber = r.nextInt(1000);// random numbers will be chosen with 1-1000 range
            strBuilder.append(ranNumber).append(" ");
        }
        System.out.println(strBuilder.toString());

        Pattern p = Pattern.compile("([\\D])(?<zz>\\d{2})([\\D])");// using pattern to replace double numbers
        Matcher m = p.matcher(strBuilder);
        String newStr = m.replaceAll(" -1 ");// replacing double numbers with -1
        System.out.println(newStr);// printing out new string with replaced positions
    }
}

