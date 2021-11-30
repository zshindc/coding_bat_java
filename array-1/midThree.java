/**
 * CS149 Coding Bat array-1 midThree Program.
 * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. 
 * The array length will be at least 3.
 * @author Zachary Shin
 * @version 11-30-21
 */
public int[] midThree(int[] nums) {
  int[] result = new int[3];
  
  if (nums.length == 3) {
    result = nums;
  } else {
    result[0] = nums[(nums.length/2) - 1];
    result[1] = nums[nums.length/2];
    result[2] = nums[(nums.length/2) + 1];
  }
  return result;
    
}
