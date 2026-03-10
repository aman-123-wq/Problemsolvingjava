package hackerrankcomparator;

public class AnagramFrequency {
	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() != s2.length()) {
	            return false;
	        }
		int[] freq = new int[26];
		for (int i = 0; i < s1.length(); i++) {
	            freq[s1.charAt(i) - 'a']++;
	            freq[s2.charAt(i) - 'a']--;
	        }
		for (int i = 0; i < 26; i++) {
	            if (freq[i] != 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        System.out.println(isAnagram("listen", "silent"));
	    }
	}


