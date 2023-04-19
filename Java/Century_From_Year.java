public class Solution {
  public static int century(int number) {
    int cent = 0;
    
    // Getting the century
    while(number > 0){
      number = number - 100;
      cent ++;
    }
    return cent;
  }
}
