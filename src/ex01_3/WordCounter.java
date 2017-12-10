package ex01_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WordCounter {

    private static Map<String, Integer> wordCounter = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        count();
        print();
    }

    private static void count() throws IOException {
        System.out.println("英文の単語の文字数を数えます。");
        System.out.println("英文を入力してください。空行の場合、結果を出力して終了します。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (String line = br.readLine(); !line.equals(""); line = br.readLine()) {
            String[] words = line.toLowerCase().split("[^a-zA-Z]");
            for (String word : words) {
                countUp(word);
            }

        }
    }

    private static void countUp(String word) {
        if (word.length() == 0)
            return;

        int count = 0;
        if (wordCounter.containsKey(word)) {
            count = wordCounter.get(word);
        }
        wordCounter.put(word, ++count);
    }

    private static void print() {
        List<Entry<String, Integer>> entries = new ArrayList<Entry<String, Integer>>(wordCounter.entrySet());
        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
