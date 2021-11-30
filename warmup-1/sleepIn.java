/* Warmup-1 sleepIn Java Program.
* 
* @author Zachary Shin
* @version 11-3-21
*/

/* sleepIn class. 
* @param weekday is when it is a weekday (true) or not (false)
* @param vacation is when we are on vacation
* @return sleep in if not a weekday or on vacation (true)
*/
public boolean sleepIn(boolean weekday, boolean vacation) {
  if (weekday == false || vacation == true) {
    return true;
  }
  return false;
}
