package JAVA.Programs.javaPrograme1;

/*Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

*/


import java.util.*;


/*Logic

        For every string:

        Convert it to a character array.
        Sort the characters.
        Use the sorted string as the HashMap key.
        All anagrams will produce the same key.

        List<String> group = Arrays.asList("eat", "tea", "ate"); //["eat", "tea", "ate"]
        List<List<String>> =
                            [["eat", "tea", "ate"],
                            ["tan", "nat"],
                            ["bat"]]

List<List<String>>
        |
        +---- List<String> → ["eat", "tea", "ate"]
        |
        +---- List<String> → ["tan", "nat"]
        |
        +---- List<String> → ["bat"]

        */




public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        // Map stores:
        // sorted characters -> list of anagram strings
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // Convert string into character array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert sorted character array back to String
            String key = new String(chars);

            // Create the list if the key does not exist
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                /*We create an empty ArrayList:
                new ArrayList<>() and put it into the Map:
                map.put("aet", new ArrayList<>());.
                first time map look like this "aet" → []
                iterations
                 "aet" → ["eat"]
                 "aet" → ["eat", "tea"]
                 "aet" → ["eat", "tea", "ate"]
                 */

            }

            // Add the original string to its anagram group
            //gets that empty list and adds "eat":
            //here it is adding element to arrayList.
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
        // Return all grouped anagrams
        /*This line is the final step that converts the Map's groups into the required List<List<String>> result:
        * The final map is
        *   "aet" → ["eat", "tea", "ate"]
            "ant" → ["tan", "nat"]
            "abt" → ["bat"]

             Map
             ↓
            Key       Value
            "aet"  →  List<String>
            "ant"  →  List<String>
            "abt"  →  List<String>

            map.values()  -  Give me all the values stored inside the Map.
            i.e   ["eat", "tea", "ate"]
                  ["tan", "nat"]
                  ["bat"]

            map.values() - returns a Collection<List<String>>


            map.values()
                    ↓
            [
                ["eat", "tea", "ate"],
                ["tan", "nat"],
                ["bat"]
            ]

        * */
    }

    public static void main(String[] args) {

        String[] strs = {
                "eat",
                "tea",
                "tan",
                "ate",
                "nat",
                "bat"
        };

        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}