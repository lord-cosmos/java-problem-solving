package practice.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
  /*
   * @param strs: a list of strings
   * 
   * @return: encodes a list of strings to a single string.
   */

  // public String encode(List<String> strs) {
  // String res = "";
  // int length = strs.size();
  // for (int i = 0; i < length; i++) {
  // String str_length = String.valueOf(strs.get(i).length());
  // String eachPart = str_length.concat("#").concat(strs.get(i));
  // res = res.concat(eachPart);
  // }
  // return res;
  // }

  // we can use String Builder class, whose object is mutable string.

  public String encode(List<String> strs) {
    StringBuilder encodedString = new StringBuilder();
    for (String str : strs) {
      encodedString.append(str.length()).append("#").append(str);
    }
    return encodedString.toString();
  }

  /*
   * @param str: A strings
   * 
   * @return: dcodes a single string to a list of strings
   */

  // String comparison with == checks for reference same or not.
  // So, it is failing for me, when I check Character.toString('#') != "#" {run}
  public List<String> decode(String str) {
    List<String> list = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
      int j = i;
      while (str.charAt(j) != '#')
        j++;

      int length = Integer.valueOf(str.substring(i, j));
      i = j + 1 + length;
      list.add(str.substring(j + 1, i));
    }
    return list;
  }

  public static void main(String[] args) {
    EncodeDecode e = new EncodeDecode();
    List<String> strs = new ArrayList<>();
    strs.add("3@hello");
    strs.add("ello");
    strs.add("lo");
    String s = e.encode(strs);
    System.out.println("The encoded string : " + s);
    System.out.println("The encoded string : " + e.decode(s));
  }
}
