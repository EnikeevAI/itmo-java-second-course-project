package ru.itmo.second_course_project.application_items.menu;

import java.util.Scanner;

public abstract class MenuBase {
    String text;

    String userText;

    protected void setText(String text) {
        if (text == null) throw new IllegalArgumentException("Текст меню не может быть пустым");
        this.text = text;
    }

    private void printText() {
        System.out.println();
        System.out.println(this.text);
    }

    protected int getUserCommandNumber() {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("Введите, пожалуйста, номер команды");
            userText = userInput.nextLine();
            if(isUserTextCorrect(userText)){
                break;
            }
            System.out.println("Команда задана неверно");
        }
        return Integer.parseInt(userText);
    }

    private boolean isUserTextCorrect(String userText) {
        try{
            Integer.parseInt(userText);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    abstract void getUserAnswer();
    public void showAndRun() {
        printText();
        getUserAnswer();
    }
}
