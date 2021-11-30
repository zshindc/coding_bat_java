/**
 * CS149 String-1 firstHalf Program.
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo"
 * @author Zachary Shin
 * @version 11-30-2021
 */
public String firstHalf(String str) {
  return str.substring(0, str.length() / 2);
}
