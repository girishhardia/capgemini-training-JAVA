// input: "Meet me at the clock tower"

// 1. first word vowels convert into %
// 2. second word consonants convert into #
// 3. Third word should be in a CAPITAL

// Repeat this sequence from forth word onward

// output: "M%%t #e AT th% ##o## TOWER"

public class StringQ1{
	public static void main(String[] args){
		String input = "Meet me at the clock tower";
		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (i % 3 == 0) {
				result.append(word.replaceAll("[aeiouAEIOU]", "%"));
			} else if (i % 3 == 1) {
				result.append(word.replaceAll("(?i)[b-df-hj-np-tv-z]", "#"));
			} else if (i % 3 == 2) {
				result.append(word.toUpperCase());
			} else {
				result.append(word);
			}
		}
		System.out.println(result.toString());
		
	}
}