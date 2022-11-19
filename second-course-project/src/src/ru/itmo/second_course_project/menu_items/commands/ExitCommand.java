package src.ru.itmo.second_course_project.menu_items.commands;

public class ExitCommand extends CommandBase {
    @Override
    public void execute() {
        game.finishTheGame();
    }
}
