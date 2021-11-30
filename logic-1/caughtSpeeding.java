/**
 * CS149 Coding Bat Logic-1 caughtSpeeding Program.
 * You are driving a little too fast, and a police officer stops you. 
 * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
 * If speed is 60 or less, the result is 0. 
 * If speed is between 61 and 80 inclusive, the result is 1. 
 * If speed is 81 or more, the result is 2. 
 * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
 * @author Zachary Shin
 * @version 11-30-21
 */
public int caughtSpeeding(int speed, boolean isBirthday) {
  int noTicket = 0;
  int smallTicket = 1;
  int bigTicket = 2;
  int value = noTicket;
  int newSpeed;
  
  if (isBirthday) {
    newSpeed = speed - 5;
  } else {
    newSpeed = speed;
  }
  
  if (newSpeed >= 61 && newSpeed <= 80) {
    value = smallTicket;
  }
  if (newSpeed > 80) {
    value = bigTicket;
  }
  return value;
}
