package neetcode.ArraysAndHashing;

public class validAnagram {
  /**
   * @param s : string 1
   * @param t : string 2
   * @return boolean
   */
  public boolean isAnagram(String s, String t) {

    if (s.length() != t.length())
      return false;

    // HashMap<Character , Integer> map = new HashMap<>();

    // for(int i=0;i < s.length(); i++ ){
    // char c = s.charAt(i);
    // if (map.containsKey(c)){
    // map.put(c, map.getOrDefault(c,0)+1);
    // }else{
    // map.put(c,1);
    // }
    // }

    // for(int i=0; i< s.length(); i++){
    // char c = t.charAt(i);
    // map.put(c, map.getOrDefault(c,0) - 1);
    // }

    // for (int i : map.values()){
    // if(i!=0){
    // return false;
    // }
    // }

    // return true;

    // Java uses unicode characters.
    // check question for constraints
    // s and t consist of lowercase English letters.

    // as alphabets are 26 , fixed size, we can use the array of 26
    // it is more faster than HashMap, as implementation of HashMap is costlier.

    // lets say if we have unicode characters, then we
    // can use hashmap, implementation is commented above.

    int[] store = new int[26];
    // int count = 0;

    for (int i = 0; i < s.length(); i++) {
      store[s.charAt(i) - 'a']++;
      store[t.charAt(i) - 'a']--;
    }
    for (int n : store) {

      if (n != 0) {
        return false;
      }

    }
    return true;
  }

  public static void main(String[] args) {
    validAnagram v = new validAnagram();
    System.out.println(v.isAnagram("tea", "aet"));
  }
}

// remember, as the size of array is always 26,
// space complexity is O(26) or constant
// not O(n) as it may seem taking extra space.