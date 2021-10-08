import java.util.*;


public class Exercise {

    public static void main(String [] args) {
        String example = "the cat is in the bag";

        Map<String, Integer> wordMap = WordFrequency.countWords(example);
        System.out.println("Words Not Sorted By Frequency: "+wordMap);

        Map<String, Integer> frequencyMap = WordFrequency.sortByFrequency(wordMap);
        System.out.println("Words Sorted By Frequency: "+frequencyMap);

        //another example
        example = "given a piece of text, it should output each word in the text and the number of times it occurred. the words should be sorted by frequency, words with the same frequency can be in any order. ";
        wordMap = WordFrequency.countWords(example);
        System.out.println("Words Not Sorted By Frequency: "+wordMap);

        frequencyMap = WordFrequency.sortByFrequency(wordMap);
        System.out.println("Words Sorted By Frequency: "+frequencyMap);
    }
}
