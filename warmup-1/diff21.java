/* Warmup-1 diff21 Java Program.
* 
* @author Zachary Shin
* @version 11-30-21
*/

/* diff21 class.
* @param n given integer
* @return (n - 21) * 2 is the absolute difference double if n is over 21
* @return 21 - n is the absolute difference between n and 21 when n is under 21
*/
public int diff21(int n) {
  if (n >= 21) {
    return (n - 21) * 2;
  } else {
    return 21 - n;
  }
}
