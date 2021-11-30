/**
 * CS149 Coding Bat withoutDoubles Program.
 * Return the sum of two 6-sided dice rolls, each in the range 1..6. 
 * However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
 * @author Zachary Shin
 * @version 11-30-21
 */
public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  int dieSum = die1 + die2;
  if (noDoubles && die1 == die2) {
    if (die1 == 6 && die2 == 6) {
      dieSum = 1 + die2; 
    } else { dieSum = die1 + die2 + 1; }
  } 
  return dieSum;
}
