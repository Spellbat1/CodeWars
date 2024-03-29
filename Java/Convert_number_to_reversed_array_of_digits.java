public class Kata {
  public static int[] digitize(long n) {
    int count = 0;
    long num = n;
    
    // Getting the amount of digits in the number n
    while(num >= 1){
      num = num/10;
      count ++;
    }
    
    // In case the number was 0
    if(count == 0){
      int[] array = new int[]{0}; 
      return array;
    }
    
    // Reversing the digits
    int[] rev = new int[count];
    for(int i = 0; i < count; i++){
      long dig = n % 10;
      n = n/10;
      rev[i] = (int) dig;
    }
    
    return rev;
  }
}
