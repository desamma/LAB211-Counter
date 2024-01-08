package Common;

import java.util.StringTokenizer;

public class Algorithm{
        private int[] charCount = new int[256];
        private int[] wordCount = new int[1000];
        private String[] words = new String[1000];
        


    public void theCounter(StringTokenizer tokenizer){

        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            characterCounter(charCount, token);
//            wordCounter
        }

        displayResults(charCount);
    }

    private void characterCounter(int[] charCount, String token){
        for (int i = 0; i < token.length(); i++) {
            char ch = token.charAt(i);
            charCount[ch]++;
        }
    }

    private void wordCounter(int[] wordCount, String token){
        
    }

    private void displayResults(int[] charCount){
        System.out.println("Character Counts:");
        for (int i = 0; i < charCount.length; i++){
            if (charCount[i] > 0) {
                System.out.println((char) i + " = " + charCount[i]);
            }
        }

    }
}
