package ru.itmo.second_course_project.application_items.menu;

import ru.itmo.second_course_project.application_items.commands.MenuCommand;

public class StartMenu extends MenuBase {
    MenuCommand startNewGame;
    MenuCommand loadGameFromFile;
    MenuCommand exit;

    public StartMenu(MenuCommand startNewGame, MenuCommand loadGameFromFile, MenuCommand exit) {
        setText(MenuStaticInfo.START_MENU_TEXT);
        setStartNewGame(startNewGame);
        setLoadGameFromFile(loadGameFromFile);
        setExit(exit);
    }

    private void setStartNewGame(MenuCommand startNewGame) {
        if (startNewGame == null)
            throw new IllegalArgumentException("Значение команды startGame в StartMenu = null");
        this.startNewGame = startNewGame;
    }

    private void setLoadGameFromFile(MenuCommand loadGameFromFile) {
        if (loadGameFromFile == null)
            throw new IllegalArgumentException("Значение команды loadGameFromFile в StartMenu = null");
        this.loadGameFromFile = loadGameFromFile;
    }

    private void setExit(MenuCommand exit) {
        if (exit == null)
            throw new IllegalArgumentException("Значение команды exit в StartMenu = null");
        this.exit = exit;
    }
    @Override
    protected void getUserAnswer() {
        int userCommandNumber = getUserCommandNumber();

        switch (userCommandNumber) {
            case 1 -> startNewGame.execute();
            case 2 -> loadGameFromFile.execute();
            case 3 -> exit.execute();
            default -> System.out.println("Такой команды нет. Проверьте правильность ввода номера команды");
        }
    }

}
