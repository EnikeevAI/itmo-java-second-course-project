package src.ru.itmo.second_course_project.menu_items;

import src.ru.itmo.second_course_project.menu_items.commands.ExitCommand;
import src.ru.itmo.second_course_project.menu_items.commands.LoadGameFromFileCommand;
import src.ru.itmo.second_course_project.menu_items.commands.StartTheGameCommand;

import java.util.Scanner;

public class StartMenu extends MenuBase {
    public StartMenu() {
        super(MenuStaticInfo.START_MENU_TEXT, MenuStaticInfo.START_MENU_MAX_COMMAND_NUMBER);
    }

    @Override
    public void commandExecute() {
        int userCommandNumber = getUserCommandNumber();
        switch (userCommandNumber) {
            case 1:
               new StartTheGameCommand().execute();
               break;
            case 2:
                new LoadGameFromFileCommand().execute();
                break;
            case 3:
                new ExitCommand().execute();
        }
    }
}
