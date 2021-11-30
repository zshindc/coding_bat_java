/**
 * CS149 Coding Bat String-2 catDog Program.
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
 * @author Zachary Shin
 * @version 11-30-21
 */
public boolean catDog(String str) {
  int cat = 0;
  int dog = 0;
  String catName = "cat";
  String dogName = "dog";
  
  for (int i = 0; i < str.length() - 2; i++) {
    if (catName.equals(str.substring(i, i + 3))) {
      cat++;
    }
    if (dogName.equals(str.substring(i, i + 3))) {
      dog++;
    }
  }
  return cat == dog;
}
