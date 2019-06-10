public class LongestUncommonSubsequenceI{

    // https://leetcode.com/problems/longest-uncommon-subsequence-i/description/

    // Fuck me!!!
    // Nao Jin Ji Zhuan Wan

    private static String a = "aba", b = "cdc";

    private int findLUSlength(String a, String b){
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }

}
