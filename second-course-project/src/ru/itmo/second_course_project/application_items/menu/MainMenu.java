package ru.itmo.second_course_project.application_items.menu;

import ru.itmo.second_course_project.application_items.commands.MenuCommand;

public class MainMenu extends MenuBase {
    private MenuCommand startNewGame;
    private MenuCommand continueGame;
    private MenuCommand loadGame;
    private MenuCommand saveGame;
    private MenuCommand exit;

    public MainMenu(MenuCommand startNewGame,
                    MenuCommand continueGame,
                    MenuCommand loadGame,
                    MenuCommand saveGame,
                    MenuCommand exit)
    {
        setText(MenuStaticInfo.MAIN_MENU_TEXT);
        setStartNewGame(startNewGame);
        setContinueGame(continueGame);
        setLoadGame(loadGame);
        setSaveGame(saveGame);
        setExit(exit);
    }

    private void setStartNewGame(MenuCommand startNewGame) {
        if (startNewGame == null)
            throw new IllegalArgumentException("Значение команды startNewGame в MainMenu = null");
        this.startNewGame = startNewGame;
    }

    private void setContinueGame(MenuCommand continueGame) {
        if (continueGame == null)
            throw new IllegalArgumentException("Значение команды continueGame в MainMenu = null");
        this.continueGame = continueGame;
    }

    private void setLoadGame(MenuCommand loadGame) {
        if (loadGame == null)
            throw new IllegalArgumentException("Значение команды loadGame в MainMenu = null");
        this.loadGame = loadGame;
    }

    private void setSaveGame(MenuCommand saveGame) {
        if (saveGame == null)
            throw new IllegalArgumentException("Значение команды saveGame в MainMenu = null");
        this.saveGame = saveGame;
    }

    private void setExit(MenuCommand exit) {
        if (exit == null)
            throw new IllegalArgumentException("Значение команды exit в MainMenu = null");
        this.exit = exit;
    }

    @Override
    public void getUserAnswer() {
        int userCommandNumber = getUserCommandNumber();

        switch (userCommandNumber) {
            case 1 -> startNewGame.execute();
            case 2 -> continueGame.execute();
            case 3 -> loadGame.execute();
            case 4 -> saveGame.execute();
            case 5 -> exit.execute();
            default -> System.out.println("Такой команды нет. Проверьте правильность ввода номера команды");
        }
    }
}
