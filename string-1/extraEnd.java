/**
 * CS149 Coding Bat String-1 extraEnd Program.
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
 * The string length will be at least 2.
 * @author Zachary Shin
 * @version 11-30-21
 */
public String extraEnd(String str) {
  String end = str.substring(str.length() - 2);
  return end + end + end;
}
