package practice.twoPointer;

import utils.AlphaNumeric;

public class validPalindrome {
  public boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
      Character start = s.charAt(i);
      Character end = s.charAt(j);

      if (!Character.isLetterOrDigit(start)) {
        i++;
        continue;
      }

      if (!Character.isLetterOrDigit(end)) {
        j--;
        continue;
      }

      if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    validPalindrome vp = new validPalindrome();
    System.out.println(vp.isPalindrome("madaM"));
    System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
  }
}
