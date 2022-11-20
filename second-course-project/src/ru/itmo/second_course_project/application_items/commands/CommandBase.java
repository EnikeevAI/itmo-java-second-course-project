package ru.itmo.second_course_project.application_items.commands;

import ru.itmo.second_course_project.application_items.Game;

public abstract class CommandBase implements MenuCommand{
    Game game;

    protected CommandBase(Game game) {
        setGame(game);
    }

    private void setGame(Game game) {
        if (game == null) throw new IllegalArgumentException(
                "В конструктор класса CommandBase передан объект Game со значением null");
        this.game = game;
    }
}
