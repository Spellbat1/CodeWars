public class Dinglemouse {
  
  public static String findEndPoints(String s) {
    // Splits the String so every line is its own array.
    String[] spl = s.split("\n");
    String as = "";
    
    for(int i = 0; i < spl.length; i++){
      String st = spl[i];
      String[] split = st.split("");
      
      // Splits the array into each character
      for(int j = 0; j < split.length; j++){
        if(split[j].equals("*")){
          // If the first row element is a "*" while the next is also a "*"
          if(j == 0 && (split[j+1].equals("*") || split[j+1].equals("X")) &&
                       (split[j+2].equals("*") || split[j+2].equals("X")))
            split[j] = "X";
          
          // If the last row element is a "*" while the previous is also a "*"
          else if(j == split.length-1 && (split[j-1].equals("*") || split[j-1].equals("X")) &&
                                         (split[j-2].equals("*") || split[j-2].equals("X")))
            split[j] = "X";
          
          // Finding the last "*" in a row
          else if (j > 1 && (split[j-1].equals("*") || split[j-1].equals("X")) &&
                            (split[j-2].equals("*") || split[j-2].equals("X")) && 
                             split[j+1].equals(" "))
            split[j] = "X";
          
          // Finding the first "*" in a row
          else if(j < split.length-2 && (split[j+1].equals("*") || split[j+1].equals("X")) &&
                                        (split[j+2].equals("*") || split[j+2].equals("X")) && 
                                         split[j-1].equals(" "))
            split[j] = "X"; 
          
          // If the first column element is a "*" while the next is also a "*"
          if(i == 0 && (Character.toString(spl[i+1].charAt(j)).equals("*") || 
                        Character.toString(spl[i+1].charAt(j)).equals("X")) &&
                       (Character.toString(spl[i+2].charAt(j)).equals("*") || 
                        Character.toString(spl[i+2].charAt(j)).equals("X")))
            split[j] = "X";
          
          // If the last column element is a "*" while the previous is also a "*"
          else if(i == spl.length-1 && (Character.toString(spl[i-1].charAt(j)).equals("*") || 
                                        Character.toString(spl[i-1].charAt(j)).equals("X")) &&
                                       (Character.toString(spl[i-2].charAt(j)).equals("*") || 
                                        Character.toString(spl[i-2].charAt(j)).equals("X")))
            split[j] = "X";
          
          // Finding the last "*" in a column
          else if (i > 1 && (Character.toString(spl[i-1].charAt(j)).equals("*") || 
                                                 Character.toString(spl[i-1].charAt(j)).equals("X")) && 
                                                (Character.toString(spl[i-2].charAt(j)).equals("*") || 
                                                 Character.toString(spl[i-2].charAt(j)).equals("X")) &&
                                                 Character.toString(spl[i+1].charAt(j)).equals(" "))
            split[j] = "X";
            
          // Finding the first "*" in a column
          else if(i < spl.length-2 && (Character.toString(spl[i+1].charAt(j)).equals("*") || 
                                                Character.toString(spl[i+1].charAt(j)).equals("X")) && 
                                               (Character.toString(spl[i+2].charAt(j)).equals("*") || 
                                                Character.toString(spl[i+2].charAt(j)).equals("X")) && 
                                                Character.toString(spl[i-1].charAt(j)).equals(" "))
            split[j] = "X";
          
          // If the top left element is a "*" while the two down right is also a "*"
          if(i == 0 && j == 0 && (Character.toString(spl[i+1].charAt(j+1)).equals("*") || 
                                  Character.toString(spl[i+1].charAt(j+1)).equals("X")) && 
                                 (Character.toString(spl[i+2].charAt(j+2)).equals("*") || 
                                  Character.toString(spl[i+2].charAt(j+2)).equals("X")))
            split[j] = "X";
          
          // If the top right element is a "*" while the two down left is also "*"
          else if(i == spl.length-1 && j == 0 && (Character.toString(spl[i-1].charAt(j+1)).equals("*") || 
                                                  Character.toString(spl[i-1].charAt(j+1)).equals("X")) &&
                                                 (Character.toString(spl[i-2].charAt(j+2)).equals("*") || 
                                                  Character.toString(spl[i-2].charAt(j+2)).equals("X")))
            split[j] = "X";
          
          // If the bottom left element is a "*" while the two up right is also a "*"
          else if(i == 0 && j == split.length-1 && (Character.toString(spl[i+1].charAt(j-1)).equals("*") || 
                                                    Character.toString(spl[i+1].charAt(j-1)).equals("X")) && 
                                                   (Character.toString(spl[i+2].charAt(j-2)).equals("*") || 
                                                    Character.toString(spl[i+2].charAt(j-2)).equals("X")))
            split[j] = "X";
          
          // If the bottom right element is a "*" while the two up left is also a "*"
          else if(i == spl.length-1 && j == split.length-1 && (Character.toString(spl[i-1].charAt(j-1)).equals("*") || 
                                                               Character.toString(spl[i-1].charAt(j-1)).equals("X")) &&
                                                              (Character.toString(spl[i-2].charAt(j-2)).equals("*") || 
                                                               Character.toString(spl[i-2].charAt(j-2)).equals("X")))
            split[j] = "X";
          
          // If any element in the top row is a "*" while any down-left diagonal is also a "*"
          else if(i == 0 && j > 1 && (Character.toString(spl[i+1].charAt(j-1)).equals("*") || 
                                      Character.toString(spl[i+1].charAt(j-1)).equals("X")) &&
                                     (Character.toString(spl[i+2].charAt(j-2)).equals("*") || 
                                      Character.toString(spl[i+2].charAt(j-2)).equals("X")))
            split[j] = "X";
          
          // If any element in the top row is a "*" while any down-right diagonal is also a "*"
          else if(i == 0 && j < split.length-2 && (Character.toString(spl[i+1].charAt(j+1)).equals("*") || 
                                                   Character.toString(spl[i+1].charAt(j+1)).equals("X")) &&
                                                  (Character.toString(spl[i+2].charAt(j+2)).equals("*") || 
                                                   Character.toString(spl[i+2].charAt(j+2)).equals("X")))
            split[j] = "X";
          
          // If any element in the bottom row is a "*" while any up-left diagonal is also a "*"
          else if(i == spl.length-1 && j > 1 && (Character.toString(spl[i-1].charAt(j-1)).equals("*") || 
                                                 Character.toString(spl[i-1].charAt(j-1)).equals("X")) &&
                                                (Character.toString(spl[i-2].charAt(j-2)).equals("*") || 
                                                 Character.toString(spl[i-2].charAt(j-2)).equals("X")))
            split[j] = "X";
          
          // If any element in the bottom row is a "*" while any up-right diagonal is also a "*"
          else if(i == spl.length-1 && j < split.length-2 && (Character.toString(spl[i-1].charAt(j+1)).equals("*") || 
                                                              Character.toString(spl[i-1].charAt(j+1)).equals("X")) &&
                                                             (Character.toString(spl[i-2].charAt(j+2)).equals("*") || 
                                                              Character.toString(spl[i-2].charAt(j+2)).equals("X")))
            split[j] = "X";
          
          // If any element in the left column is a "*" while any right-up is also a "*"
          else if(i > 1 && j == 0 && (Character.toString(spl[i-1].charAt(j+1)).equals("*") || 
                                      Character.toString(spl[i-1].charAt(j+1)).equals("X")) &&
                                     (Character.toString(spl[i-2].charAt(j+2)).equals("*") || 
                                      Character.toString(spl[i-2].charAt(j+2)).equals("X")))
            split[j] = "X";
          
          // If any element in the left column is a "*" while any right-down is also a "*"
          else if(i < spl.length-2 && j == 0 && (Character.toString(spl[i+1].charAt(j+1)).equals("*") || 
                                                 Character.toString(spl[i+1].charAt(j+1)).equals("X")) &&
                                                (Character.toString(spl[i+2].charAt(j+2)).equals("*") || 
                                                 Character.toString(spl[i+2].charAt(j+2)).equals("X")))
            split[j] = "X";
          
          // If any element in the right column is a "*" while any left-up is also a "*"
          else if(i > 1 && j == split.length-1 && (Character.toString(spl[i-1].charAt(j-1)).equals("*") || 
                                                   Character.toString(spl[i-1].charAt(j-1)).equals("X")) &&
                                                  (Character.toString(spl[i-2].charAt(j-2)).equals("*") || 
                                                   Character.toString(spl[i-2].charAt(j-2)).equals("X")))
            split[j] = "X";
          
          // If any element in the right column is a "*" while any left-down is also one
          else if(i < spl.length-2 && j == split.length-1 && (Character.toString(spl[i+1].charAt(j-1)).equals("*") || 
                                                              Character.toString(spl[i+1].charAt(j-1)).equals("X")) &&
                                                             (Character.toString(spl[i+2].charAt(j-2)).equals("*") || 
                                                              Character.toString(spl[i+2].charAt(j-2)).equals("X")))
            split[j] = "X";
          
          // Finding the last "*" in a up-down, left-right diagonal
          else if (i < spl.length-1 && i > 1 && j < split.length-1 && j > 1 && 
                  (Character.toString(spl[i-1].charAt(j-1)).equals("*") || 
                   Character.toString(spl[i-1].charAt(j-1)).equals("X")) && 
                  (Character.toString(spl[i-2].charAt(j-2)).equals("*") || 
                   Character.toString(spl[i-2].charAt(j-2)).equals("X")) &&
                   Character.toString(spl[i+1].charAt(j+1)).equals(" "))
            split[j] = "X";
            
            // Finding the last "*" in a up-down, right-left diagonal
           else if(i < spl.length-1 && i > 1 && j < split.length-2 && j > 0 &&
                 (Character.toString(spl[i-1].charAt(j+1)).equals("*") || 
                  Character.toString(spl[i-1].charAt(j+1)).equals("X")) && 
                 (Character.toString(spl[i-2].charAt(j+2)).equals("*") || 
                  Character.toString(spl[i-2].charAt(j+2)).equals("X")) &&
                  Character.toString(spl[i+1].charAt(j-1)).equals(" "))
            split[j] = "X";
            
            // Finding the first "*" in a up-down, right-left diagonal
           else if(i < spl.length-2 && i > 0 && j < split.length-1 && j > 1 &&
                 (Character.toString(spl[i+1].charAt(j-1)).equals("*") || 
                  Character.toString(spl[i+1].charAt(j-1)).equals("X")) && 
                 (Character.toString(spl[i+2].charAt(j-2)).equals("*") || 
                  Character.toString(spl[i+2].charAt(j-2)).equals("X")) && 
                  Character.toString(spl[i-1].charAt(j+1)).equals(" "))
             split[j] = "X";
            
            // Finding the first "*" in a up-down, right-left diagonal
          else if(i < spl.length-2 && i > 0 && j < split.length-2 && j > 0 &&
                 (Character.toString(spl[i+1].charAt(j+1)).equals("*") || 
                  Character.toString(spl[i+1].charAt(j+1)).equals("X")) && 
                 (Character.toString(spl[i+2].charAt(j+2)).equals("*") || 
                  Character.toString(spl[i+2].charAt(j+2)).equals("X")) && 
                  Character.toString(spl[i-1].charAt(j-1)).equals(" "))
            split[j] = "X";
        }
        as += split[j];
      }
      as += "\n";
    }
    return as;
  }
}
