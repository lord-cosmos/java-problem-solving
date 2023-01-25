package neetcode.Stack;

import java.util.*;

public class ValidParenthesis {
  public boolean isValid(String s) {

    if (s.length() == 0)
      return true;

    HashMap<Character, Character> dict = new HashMap<>();
    dict.put(')', '(');
    dict.put(']', '[');
    dict.put('}', '{');

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
        continue;
      }

      if (stack.isEmpty())
        return false;

      char popped = stack.pop();
      if (popped != dict.get(ch)) {
        return false;
      }

    }
    if (stack.size() == 0) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    ValidParenthesis v = new ValidParenthesis();
    System.out.println(v.isValid("()[]{}"));
    System.out.println(v.isValid("()]{}"));
    System.out.println(v.isValid("(]"));
    System.out.println(v.isValid("]"));

  }
}
