/**
 * CS149 Coding Bat Array-1 commonEnd Program.
 * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. 
 * Both arrays will be length 1 or more.
 * @author Zachary Shin
 * @version 11-30-21
 */
public boolean commonEnd(int[] a, int[] b) {
  if ( a == null || b == null) {
    return false;
  }
  return a[0] == b[0] 
    || a[a.length - 1] == b[b.length - 1];
}
