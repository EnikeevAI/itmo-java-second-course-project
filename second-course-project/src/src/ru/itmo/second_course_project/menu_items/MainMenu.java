package src.ru.itmo.second_course_project.menu_items;

import src.ru.itmo.second_course_project.menu_items.commands.ExitCommand;
import src.ru.itmo.second_course_project.menu_items.commands.LoadGameFromFileCommand;
import src.ru.itmo.second_course_project.menu_items.commands.SaveGameToFile;
import src.ru.itmo.second_course_project.menu_items.commands.StartTheGameCommand;

public class MainMenu extends MenuBase {

    public MainMenu() {
        super(MenuStaticInfo.MAIN_MENU_TEXT, MenuStaticInfo.MAIN_MENU_MAX_COMMAND_NUMBER);
    }

    @Override
    void commandExecute() {
        int userCommandNumber = getUserCommandNumber();
        switch (userCommandNumber) {
            case 1:
                new StartTheGameCommand().execute();
                break;
            case 2:
                new LoadGameFromFileCommand().execute();
                break;
            case 3:
                new SaveGameToFile().execute();
            case 4:
                new ExitCommand().execute();
        }
    }
}
