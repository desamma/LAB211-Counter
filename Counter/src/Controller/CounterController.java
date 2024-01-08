
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import java.util.StringTokenizer;
import view.Menu;

public class CounterController extends Menu<String>{
    
    private Menu parentMenu;
    private static String[] mc = {"Count", "Exit"};
    private Library library;
    private Algorithm algorithm;
//    private int charCount;
//    private int wordCount;
    private StringTokenizer sTokenizer;
    
    public CounterController(Element element, Menu parentMenu){
        super("Count Controller", mc, parentMenu);
        this.parentMenu = parentMenu;
        library = new Library();
        algorithm = new Algorithm();
//        charCount = element.getcharCount();
//        wordCount = element.getwordCount();
        sTokenizer = element.getInput();
    }

    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                count();
                break;
            case 2:
                System.exit(0);
        }
    }
    
    public void count(){
        algorithm.theCounter(sTokenizer);
    }
}
