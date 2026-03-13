public class anangram {
    class Solution {
    public boolean isAnagram(String s, String t) {

        // Step 1: If lengths are different → not an anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create frequency array for 26 letters
        int[] arr = new int[26];

        // Step 3: Count characters of string s
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        // Step 4: Subtract using string t
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;

            // If count becomes negative → not an anagram
            if (arr[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        // Step 5: If everything balanced → anagram
        return true;
    }
}

}
