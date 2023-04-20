public class JadenCase {

	public String toJadenCase(String phrase) {
    // In case phrase doesn't have anything
		if(phrase == null || phrase == ""){
      return null;
    }
    
    // Separate each word
    String[] phr = phrase.split(" ");
    
    // Capitalize the first letter of each word
    String str = "";
    for(int i = 0; i < phr.length; i++){
      char at = phr[i].charAt(0);
      String a = "";
      if(Character.isUpperCase(at)){
        a = String.valueOf(at);
      } else{
        a = String.valueOf(at);
        a = a.toUpperCase();
      }
      str += a;
      System.out.println(str);
      str += phr[i].substring(1) + " ";
    }
    System.out.println(str);
    return str.substring(0, str.length()-1);
	}

}
