public class Maps {
  public static int[] map(int[] arr) {
    int[] nearr = new int[arr.length];
    
    // Double every number.
    for(int i = 0; i < arr.length; i++){
      nearr[i] = arr[i] * 2;
    }
    
    return nearr;
  }
}
