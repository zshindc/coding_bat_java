/**
 * CS149 Coding Bat Array-2 fizzArray3 Program.
 * Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. 
 * The end number will be greater or equal to the start number. 
 * Note that a length-0 array is valid. (See also: FizzBuzz Code)
 * @author Zachary Shin
 * @version 11-30-21
 */
public int[] fizzArray3(int start, int end) {
  int[] result = new int[end - start];
  for (int i = start; i < end; i++) {
    result[i - start] = i;
  }
  return result;
}
