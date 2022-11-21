package ru.itmo.second_course_project.application_items;

import ru.itmo.second_course_project.application_items.commands.*;
import ru.itmo.second_course_project.application_items.io.IOOperations;
import ru.itmo.second_course_project.application_items.menu.MenuWithParagraph;
import ru.itmo.second_course_project.application_items.menu.StartMenu;
import ru.itmo.second_course_project.application_items.menu.MainMenu;
import ru.itmo.second_course_project.application_items.paragraphs.Paragraph;
import ru.itmo.second_course_project.application_items.paragraphs.ParagraphsInfo;
import ru.itmo.second_course_project.application_items.paragraphs.ParagraphsUtils;

import java.io.FileNotFoundException;

public class Game {
    private Paragraph currentParagraph;

    private IOOperations<String> gameProgressHandler;

    public Game(){
        gameProgressHandler = new IOOperations<>();
    }

    private void setCurrentParagraph(Paragraph paragraph) {
        currentParagraph = paragraph;
    }

    public Paragraph getCurrentParagraph() {
        return currentParagraph;
    }

    public void startNewGame() {
        Paragraph startParagraph = ParagraphsUtils.getParagraphByTitle(ParagraphsInfo.LITTLE_FOX_TITLE);
        nextStep(startParagraph);
    }

    public void nextStep(Paragraph paragraph) {
        setCurrentParagraph(paragraph);
        currentParagraph.printText();
        if (currentParagraph.isLastParagraph()) {
            new StartMenu(
                    new StartNewGameCommand(this),
                    new LoadGameCommand(this),
                    new ExitCommand(this)).showAndRun();
            return;
        }
        new MenuWithParagraph(
                paragraph,
                new ParagraphFirstCommand(this),
                new ParagraphSecondCommand(this),
                new ReturnToMainMenuCommand(this)).showAndRun();
    }

    public void showMainMenu() {
        new MainMenu(
                new StartNewGameCommand(this),
                new ContinueGameCommand(this),
                new LoadGameCommand(this),
                new SaveGameCommand(this),
                new ExitCommand(this)
        ).showAndRun();
    }

    public void loadGame() {
        try {
            String loadParagraphTitle = gameProgressHandler.readFromFile();
            System.out.println("Игра загружена");
            nextStep(ParagraphsUtils.getParagraphByTitle(loadParagraphTitle));
        } catch (FileNotFoundException e) {
            System.out.println("Пока нет ни одного сохранения игры. Создайте первое :)");
            if (currentParagraph == null) {
                run();
            } else {
                showMainMenu();
            }
        }
    }

    public void saveGame() {
        System.out.println("Сохраняем игру в файл");
        gameProgressHandler.writeToFile(currentParagraph.getTitle());
        System.out.println("Игра успешно сохранена");
        showMainMenu();
    }

    public void continueGame() {
        nextStep(currentParagraph);
    }

    public void exit() {
        System.out.println("Спасибо за игру!");
    }

    public void run() {
        new StartMenu(new StartNewGameCommand(this),
                new LoadGameCommand(this),
                new ExitCommand(this))
                .showAndRun();
    }

}
