import java.util.*;;
class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        HashMap<Character,String> mcHashMap = new HashMap<>();
        // store morseCode
        for (int i = 0; i < morseCode.length; i++) {
            mcHashMap.put((char) ('a' + i), morseCode[i]);
        }
        // create morseCode from string
        // HashMap<String,Integer> resultMorseCode = new HashMap<>();
        Set<String> result = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder morse = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                morse.append(mcHashMap.get(word.charAt(j)));
            }
           result.add(morse.toString());
        }
        // Set<Character> test = mcHashMap.keySet();
        // for (Character x : test) {
        //     System.out.println(x);
        // }
        return result.size();
    }
}