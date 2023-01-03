package utils;

public class AlphaNumeric {
  public static boolean checkIfAlphanumeric(char character) {
    if ((character >= '0' & character <= '9') || (character >= 'a' && character <= 'z')
        || (character >= 'A' && character <= 'Z')) {
      return true;
    } else {
      return false;
    }
  }
}
