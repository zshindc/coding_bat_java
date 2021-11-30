/**
 * CS149 Coding Bat String-1 withoutEnd Program.
 * Given a string, return a version without the first and last char, so "Hello" yields "ell". 
 * The string length will be at least 2.
 * @author Zachary Shin
 * @version 11-30-21
 */
public String withoutEnd(String str) {
  return str.substring(1, str.length() - 1);
}
