
package Common;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Library {
    
    public StringTokenizer getUserInput(String promt){
       Scanner sc = new Scanner(System.in);
        System.out.println(promt + ": ");
       String userInput = sc.nextLine();
       
       StringTokenizer tokenizer = new StringTokenizer(userInput);
       return tokenizer;
   }
    
    
    
    public void display(StringTokenizer t){
        while (t.hasMoreTokens()){
            String token = t.nextToken();
            System.out.println(token);
        }
    }
}
