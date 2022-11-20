package ru.itmo.second_course_project.application_items.commands;

import ru.itmo.second_course_project.application_items.Game;

public class SaveGameCommand extends CommandBase{
    public SaveGameCommand(Game game) {
        super(game);
    }

    @Override
    public void execute() {
        game.saveGame();
    }
}
