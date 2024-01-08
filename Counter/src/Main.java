
import Common.Library;
import Controller.CounterController;
import Model.Element;
import view.Menu;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        element.setInput(library.getUserInput("Enter String: "));
        Menu mainMenu = new CounterController(element, null);
        new CounterController(element, mainMenu).run();
    }
}
