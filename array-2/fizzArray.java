/**
 * CS149 Coding Bat Array-2 fizzArray Program.
 * Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. 
 * The given n may be 0, in which case just return a length 0 array. 
 * You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. 
 * The syntax to make a new int array is: new int[desired_length]   
 * (See also: FizzBuzz Code)
 * @author Zachary Shin
 * @version 11-30-21
 */
public int[] fizzArray(int n) {
  int[] result = new int[n];
  for (int i = 0; i < n; i++) {
    result[i] = i;
  }
  return result;
}
