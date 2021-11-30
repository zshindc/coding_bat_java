/* CS149 Warmup-1 missingChar Program.
*
* @author Zachary Shin
* @version 11-30-2021
*/

/* missingChar Program.
* Return a new string where the char at index n has been removed. 
* The value of n will be a valid index of a char in the original string 
* (i.e. n will be in the range 0..str.length()-1 inclusive).
* @param str non-empty string
* @param n given integer
* @return front + back
*/
public String missingChar(String str, int n) {
  String front = str.substring(0, n);
  String back = str.substring(n + 1);
  
  return front + back;
}
