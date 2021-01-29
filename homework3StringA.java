import java.util.Random;

public class homework3StringA {
    public static void main(String[] args) {

        StringBuilder strBuilder = new StringBuilder();// using stringbuilder to create required string
        Random r = new Random();
        int ranNumber;
        int bilderCount = 1;// will count for us how many number we have in our string
        for (int i = 0; i < 100; i++) {
            ranNumber = r.nextInt(1000);// limiting random generator 1-1000
            strBuilder.append(bilderCount).append(")").append(ranNumber).append(" ");// here we build per say our string
            bilderCount++;                                                            //with command to place space
        }
        System.out.println(strBuilder.toString());// printing our string

        }

    }


