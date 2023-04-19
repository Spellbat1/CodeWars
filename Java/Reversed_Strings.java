public class Kata {

  public static String solution(String str) {
    String rev = "";
    for(int i = 0; i < str.length(); i++){
      rev = str.charAt(i) + rev;
    }
    return rev;
  }

}
