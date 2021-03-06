/**
 * CS149 Coding Bat Logic-1 squirrelPlay Program.
 * The squirrels in Palo Alto spend most of the day playing. 
 * In particular, they play if the temperature is between 60 and 90 (inclusive). 
 * Unless it is summer, then the upper limit is 100 instead of 90. 
 * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
 * @author Zachary Shin
 * @version 11-30-21
 */
public boolean squirrelPlay(int temp, boolean isSummer) {
  int newTemp = temp;
  if (isSummer && temp > 90)  {
    newTemp = temp - 10;
  }
  return newTemp >= 60 && newTemp <= 90;
}
