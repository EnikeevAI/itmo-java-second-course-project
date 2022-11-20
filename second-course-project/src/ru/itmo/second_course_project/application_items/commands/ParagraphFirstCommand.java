package ru.itmo.second_course_project.application_items.commands;

import ru.itmo.second_course_project.application_items.Game;

public class ParagraphFirstCommand extends CommandBase{
    public ParagraphFirstCommand(Game game) {
        super(game);
    }

    @Override
    public void execute() {
        game.nextStep(game.getCurrentParagraph().getFirstAnswer());
    }
}
