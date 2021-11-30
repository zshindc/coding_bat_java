/**
 * CS149 Warmup-1 sumDouble Program.
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 * @author Zachary Shin
 * @version 11-30-2021
 */
public int sumDouble(int a, int b) {
  int sum = a + b;
  
  if (a == b) {
    return 2 * sum;
  }
  else {
    return sum;
  }
}
