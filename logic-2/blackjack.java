/**
 * CS149 Coding Bat Logic-2 blackjack Program.
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. 
 * Return 0 if they both go over.
 * @author Zachary Shin
 * @version 11-30-21
 */
public int blackjack(int a, int b) {
  int value = 0;
  if (a <= 21 && b > 21) {
    value = a;
  } else if (b <= 21 && a > 21) {
    value = b;
  } else if (a <= 21 && b <= 21) {
      if (a <= b) {
        value = b;
      } else {
        value = a;
      }
    }
  return value;
}
