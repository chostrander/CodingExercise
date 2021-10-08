import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {

    public static Map<String, Integer> countWords(final String data) {
        int currentCount = 0;
        String word;
        Map<String,Integer> wordMap  = new HashMap<>();

        StringTokenizer tokenizer = new StringTokenizer(data, " ");
        while (tokenizer.hasMoreTokens()) {
            word = tokenizer.nextToken();

            if (wordMap.containsKey(word)) {
                currentCount = wordMap.get(word);
                wordMap.replace(word,++currentCount);
            } else {
                wordMap.put(word,1);
            }
        }

        return wordMap;
    }

    public static Map<String, Integer> sortByFrequency(final Map<String, Integer> wordMap) {
        return wordMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (newVal, oldVal) ->oldVal, LinkedHashMap::new));

    }
}
