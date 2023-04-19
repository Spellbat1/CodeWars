public class Bio {
    public String dnaToRna(String dna) {
      String rna = "";
      // Converting
      for(int i = 0; i < dna.length(); i++){
        String d = dna.substring(i, i + 1);
        if(d.equals("T")){
          rna += "U";
        } else{
          rna += d;
        }
      }
      return rna;
    }
}
