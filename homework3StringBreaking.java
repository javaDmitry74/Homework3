import java.util.HashMap;
import java.util.regex.Pattern;

public class homework3StringBreaking {

    public static void main(String[] args) {

        String text = "Hash table based implementation of the Map interface." +
                "This implementation provides all of the optional map operations,  " +
                " and permits null values and the null key. " +
                " (The HashMap class is roughly equivalent to Hashtable,  " +
                "except that it is unsynchronized and permits nulls.) " +
                " This class makes no guarantees as to the order of the map;" +
                " in particular, it does not guarantee that the order will remain constant over time." +
                " This implementation provides constant-time performance for the basic operations  " +
                "(get and put), assuming the hash function disperses the elements properly among the buckets. ";
        Pattern pattern = Pattern.compile("[ ]"); // creating pattern to seacrh, in our case it just space
        String[] words = pattern.split(text); //creating array to write separate words in it
        HashMap<String, Integer> wordToCount = new HashMap<>();// creating HasMap to sort out data about our text
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " " + wordToCount.get(word));
        }
    }
}