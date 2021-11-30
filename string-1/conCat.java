/**
 * CS149 Coding Bat String-1 conCat Program.
 * Given two strings, append them together (known as "concatenation") and return the result. 
 * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
 * @author Zachary Shin
 * @version 11-30-21
 */
public String conCat(String a, String b) {
  String result = a + b;
  if (a.length() > 0 && b.length() > 0) {
    char backA = a.charAt(a.length() - 1);
    char frontB = b.charAt(0);
    if (backA == frontB) {
      return a.substring(0, a.length() - 1) + b;
    }
  }
  return result;
}
