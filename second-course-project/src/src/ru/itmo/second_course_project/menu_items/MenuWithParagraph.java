package src.ru.itmo.second_course_project.menu_items;

import src.ru.itmo.second_course_project.menu_items.commands.*;
import src.ru.itmo.second_course_project.paragraphs.Paragraph;

public class MenuWithParagraph extends MenuBase {

    private Paragraph paragraph;

    public MenuWithParagraph(Paragraph paragraph) {
        super(MenuStaticInfo.MENU_WITH_PARAGRAPH_MAX_COMMAND_NUMBER);
        setParagraph(paragraph);
        printMenuText();
    }

    private void setParagraph(Paragraph paragraph) {
        if(paragraph == null) throw new IllegalArgumentException("В меню передан параграф со значением null");
        this.paragraph = paragraph;

    }

    private void printMenuText() {
        if (!isParagraphLast()) {
            System.out.println("1. " + paragraph.getFirstAnswer() + "\n2. " + paragraph.getSecondAnswer() +
                    "\n3. Выйти в главное меню");
        }
    }

    private boolean isParagraphLast() {
        setParagraph(paragraph);
        return paragraph.getFirstAnswer() == null;
    }

    @Override
    public void commandExecute() {
        if (isParagraphLast()) {
            new StartTheGameCommand().execute();
            return;
        }

        int userCommandNumber = getUserCommandNumber();

        switch (userCommandNumber) {
            case 1:
                new ParagraphFirstCommand().execute();
                break;
            case 2:
                new ParagraphSecondCommand().execute();
                break;
            case 3:
                new ReturnToMainMenuCommand().execute();
        }
    }
}
