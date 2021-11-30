/**
 * CS149 Coding Bat String-2 doubleChar Program.
 * Given a string, return a string where for every char in the original, there are two chars.
 * @author Zachary Shin
 * @version 11-30-21
 */
public String doubleChar(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) {
    result = result + str.charAt(i) + str.charAt(i);
  }
  return result;
}
