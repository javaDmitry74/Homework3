import java.util.Random;

public class homework3StringB {


    public static void main(String[] args) {

        Random r = new Random();
        int ranNumber;
        int stringCount = 1;// this will visualy count for us how many numbers generated

        for (int i = 0; i < 100; i++) { // setting limit to how many numbers will be random generated for our string
            ranNumber = r.nextInt(1000);// numbers will be genrated from range of 1 to 1000
            String str = Integer.toString(ranNumber);
            System.out.print(stringCount + ")" + str + " ");//we print our sting with random numbers
            stringCount++;
        }
    }
}


