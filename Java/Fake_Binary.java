public class FakeBinary {
    public static String fakeBin(String numberString) {
      String arr = "";
      for(int i = 0; i < numberString.length(); i++){
        char cha = numberString.charAt(i);
        
        // Changes a char the an int
        int a = Integer.parseInt(String.valueOf(cha));
        if(a < 5){
          a = 0;
        } else{
          a = 1;
        }
        String b = Integer.toString(a);
        arr = arr + b;
      }
      return arr;
    }
}
