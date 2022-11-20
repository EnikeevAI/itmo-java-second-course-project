package ru.itmo.second_course_project.application_items.commands;

import ru.itmo.second_course_project.application_items.Game;

public class LoadGameCommand extends CommandBase{
    public LoadGameCommand(Game game) {
        super(game);
    }

    @Override
    public void execute() {
        game.loadGame();
    }
}
