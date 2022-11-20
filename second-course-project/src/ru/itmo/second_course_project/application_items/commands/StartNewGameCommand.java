package ru.itmo.second_course_project.application_items.commands;

import ru.itmo.second_course_project.application_items.Game;

public class StartNewGameCommand extends CommandBase {

    public StartNewGameCommand(Game game) {
        super(game);
    }
    @Override
    public void execute() {
        game.startNewGame();
    }
}
