/* Warmup-1 sleepIn Java Program.
* 
* @author Zachary Shin
* @version 11-3-21
*/

public boolean sleepIn(boolean weekday, boolean vacation) {
  if (weekday == false || vacation == true) {
    return true;
  }
  return false;
}
