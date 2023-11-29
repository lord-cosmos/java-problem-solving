package neetcode.dp;

import java.util.List;

// Link : https://leetcode.com/problems/word-break/

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {

        for (int i = 0; i < s.length(); ++i) {
            for (int j = i; j < s.length(); ++j) {
                if (wordDict.contains(s.substring(i, j))) {
                    i = (j - i);
                }
            }
        }

        return false;
    }

    // check if string is made up of the word from list?
}
