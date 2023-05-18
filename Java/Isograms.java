public class isogram {
    public static boolean  isIsogram(String str) {
        for(int i = 0; i < str.length(); i++){
          for(int j = i+1; j < str.length(); j++){
            if(str.substring(i, i+1).equalsIgnoreCase(str.substring(j, j+1)))
                return false;
          }
        }
      return true;
    } 
}
