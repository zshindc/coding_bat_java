/**
 * CS149 Warmup-1 front3 Program.
 * Given a string, we'll say that the front is the first 3 chars of the string. 
 * If the string length is less than 3, the front is whatever is there. 
 * Return a new string which is 3 copies of the front.
 * @author Zachary Shin
 * @version 11-30-2021
 */
public String front3(String str) {
  String front = str;
  
  if (str.length() >= 3) {
    front = str.substring(0, 3);
  }
  else {
    front = str;
  }
  
  return front + front + front;
}