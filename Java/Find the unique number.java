// Make sure your class is public
 public class Kata {
    public static double findUniq(double arr[]) {
      double ans = 0;
      
      // Goes through the array
      for(int i = 0; i < arr.length-1; i++){
        
        // Finding the uniques
        if(arr[i] != arr[i+1]){
          if((i > 0 && arr[i-1] != arr[i]) || (i < arr.length-2 && arr[i+2] != arr[i])){
            ans = arr[i];
          } else{
            ans = arr[i+1];
          }
        }
      }
      return ans;
    }
}
