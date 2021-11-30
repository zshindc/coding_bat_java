/**
 * CS149 Coding Bat array-1 maxTriple Program.
 * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. 
 * The array length will be at least 3.
 * @author Zachary Shin
 * @version 11-30-21
 */
public int maxTriple(int[] nums) {
  int result = 0;
  int first = nums[0];
  int middle = nums[((nums.length+1)/2)-1];
  int end = nums[nums.length-1];
  
  if (first > middle && first > end) {
    result = first;
  }
  
  if (middle > first && middle > end) {
    result = middle;
  }
  
  if (end > first && end > middle) {
    result = end;
  }
  
  return result;
}
