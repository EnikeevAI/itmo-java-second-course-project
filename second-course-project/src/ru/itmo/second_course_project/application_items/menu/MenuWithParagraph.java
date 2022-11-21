package ru.itmo.second_course_project.application_items.menu;

import ru.itmo.second_course_project.application_items.commands.MenuCommand;
import ru.itmo.second_course_project.application_items.paragraphs.Paragraph;

public class MenuWithParagraph extends MenuBase {
    MenuCommand firstAnswer;
    MenuCommand secondAnswer;
    MenuCommand returnToMainMenu;
    private Paragraph paragraph;

    public MenuWithParagraph(Paragraph paragraph,
                             MenuCommand firstAnswer,
                             MenuCommand secondAnswer,
                             MenuCommand returnToMainMenu) {
        setParagraph(paragraph);
        setFirstAnswer(firstAnswer);
        setSecondAnswer(secondAnswer);
        setReturnToMainMenu(returnToMainMenu);
        setText();
    }

    private void setFirstAnswer(MenuCommand firstAnswer) {
        if (firstAnswer == null)
            throw new IllegalArgumentException("Значение команды firstAnswer в меню = null");
        this.firstAnswer = firstAnswer;
    }

    private void setSecondAnswer(MenuCommand secondAnswer) {
        if (secondAnswer == null)
            throw new IllegalArgumentException("Значение команды secondAnswer в меню = null");
        this.secondAnswer = secondAnswer;
    }

    private void setReturnToMainMenu(MenuCommand returnToMainMenu) {
        if (returnToMainMenu == null)
            throw new IllegalArgumentException("Значение команды returnToMainMenu в меню = null");
        this.returnToMainMenu = returnToMainMenu;
    }

    private void setParagraph(Paragraph paragraph) {
        if(paragraph == null) throw new IllegalArgumentException("В меню передан параграф со значением null");
        this.paragraph = paragraph;
    }

    private void setText() {
        text = "1. " + paragraph.getMenuFirstText() + "\n" +
                "2. " + paragraph.getMenuSecondText() + "\n" + "3. Выйти в главное меню";
    }

    @Override
    public void getUserAnswer() {
        int userCommandNumber = getUserCommandNumber();

        switch (userCommandNumber) {
            case 1 -> firstAnswer.execute();
            case 2 -> secondAnswer.execute();
            case 3 -> returnToMainMenu.execute();
            default -> System.out.println("Такой команды нет. Проверьте правильность ввода номера команды");
        }
    }

}
