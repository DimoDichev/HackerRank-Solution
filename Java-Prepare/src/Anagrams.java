import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        System.out.println(ifAnagrams(first.toLowerCase(), second.toLowerCase()));
    }

    private static String ifAnagrams(String first, String second) {
        Map<Character, Integer> firstMap = fillAnagramMap(first);
        Map<Character, Integer> secondMap = fillAnagramMap(second);

        if (firstMap.size() != secondMap.size()) {
            return "Not Anagrams";
        }

        for (var entry : firstMap.entrySet()) {
            if (!secondMap.containsKey(entry.getKey())) {
                return "Not Anagrams";
            }

            if (!entry.getValue().equals(secondMap.get(entry.getKey()))) {
                return "Not Anagrams";
            }
        }

        return "Anagrams";
    }

    private static Map<Character, Integer> fillAnagramMap(String first) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < first.length(); i++) {
            char current = first.charAt(i);

            map.putIfAbsent(current, 0);
            int value = map.get(current) + 1;
            map.put(current, value);
        }

        return map;
    }
}
