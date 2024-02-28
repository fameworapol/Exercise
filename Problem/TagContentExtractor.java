import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TagContentExtractor {
    public static void main(String[] args) {
        ArrayList<String> testCases = new ArrayList<>(List.of("<h1>Nayeem loves counseling</h1>",
                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
                "<Amee>safat codes like a ninja</amee>", "<SA premium>Imtiaz has a secret crush</SA premium>"));
        // int i = 0;
        // while(testCases.size() > i){
        // String data = testCases.get(i);
        // //Write your code here
        System.out.println(tagContentExtractor(testCases));
        ;
        // i++;
        // }
    }

    public static ArrayList<String> tagContentExtractor(ArrayList<String> data) {
        // find open tag
        // Pattern openTagPattern = Pattern.compile("<([a-zA-Z0-9]+)(?:\s+[^>]*)?>");
        // Pattern closeTagPattern = Pattern.compile("</([a-zA-Z0-9]+)>");
        // Matcher openMatcher = openTagPattern.matcher(data);
        ArrayList<String> result = new ArrayList<>();
        StringBuilder resultTemp = new StringBuilder();
        Stack<Character> tag = new Stack<>();
        for (int i = 0; i < data.size(); i++) {
            
        }
        return data;
    }
}
