package ru.itmo.second_course_project.application_items.commands;

import ru.itmo.second_course_project.application_items.Game;

public class ExitCommand extends CommandBase {
    public ExitCommand(Game game) {
        super(game);
    }
    @Override
    public void execute() {
        game.exit();
    }
}
