package src.ru.itmo.second_course_project.menu_items.commands;

import src.ru.itmo.second_course_project.menu_items.MainMenu;

public class ReturnToMainMenuCommand extends CommandBase{
    @Override
    public void execute() {
        game.setCurrentMenu(new MainMenu());
    }
}
