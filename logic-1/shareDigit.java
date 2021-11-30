/**
 * CS149 Coding Bat Logic-1 shareDigit Program.
 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. 
 * (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
 * @author Zachary Shin
 * @version 11-30-21
 */
public boolean shareDigit(int a, int b) {
  if (a % 10 == b % 10 || a / 10 == b / 10 
    || a % 10 == b / 10 || b % 10 == a / 10) {
    return true;
  }
  return false;
}
