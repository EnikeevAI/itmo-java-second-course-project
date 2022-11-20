package ru.itmo.second_course_project.application_items.commands;

import ru.itmo.second_course_project.application_items.Game;

public class ContinueGameCommand extends CommandBase implements MenuCommand{

    public ContinueGameCommand(Game game) {
        super(game);
    }

    @Override
    public void execute() {
        game.continueGame();
    }
}
