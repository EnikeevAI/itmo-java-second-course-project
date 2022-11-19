package src.ru.itmo.second_course_project;

import src.ru.itmo.second_course_project.menu_items.MenuBase;
import src.ru.itmo.second_course_project.paragraphs.Paragraph;

public class Game {

    public Game(){}
    private Paragraph currentParagraph;

    private MenuBase currentMenu;

    public void setCurrentMenu(MenuBase menu) {currentMenu = menu;}

    public void setCurrentParagraph(Paragraph paragraph) {
        currentParagraph = paragraph;
    }

    /*public void changeParagraph(Paragraph nextParagraph){
        setCurrentParagraph(nextParagraph);
        // changeMenu();
    }

    private void changeMenu() {
        if (currentParagraph == null || currentParagraph.getFirstAnswer() == null) {
            setCurrentMenu(new StartMenu());
        }
    }*/

    public void finishTheGame() {
        System.out.println("Спасибо за игру!");
    }

}
