package src.ru.itmo.second_course_project.menu_items;

import java.util.Scanner;

public abstract class MenuBase {
    String text;
    Scanner userInput;

    String userText;

    int maxCommandNumber;

    protected MenuBase(int maxCommandNumber) {
        userInput = new Scanner(System.in);
        setMaxCommandNumber(maxCommandNumber);
    }

    protected MenuBase(String text, int maxCommandNumber){
        userInput = new Scanner(System.in);
        setText(text);
        setMaxCommandNumber(maxCommandNumber);
        printMenuText();
    }

    private void setText(String text) {
        if (text == null) throw new IllegalArgumentException("Текст меню не может быть пустым");
        this.text = text;
    }

    private void setMaxCommandNumber(int number) {
        if (number < 0) throw new IllegalArgumentException("Количество команд меню д.б. больше нуля");
    }

    private void printMenuText() {
        System.out.println(text);
    }

    protected int getUserCommandNumber() {
        while (true) {
            System.out.println("Введите, пожалуйста, номер команды");
            userText = userInput.nextLine();
            if(isUserTextCorrect(userText)){
                break;
            }
            System.out.println("Неверный номер команды. Номер д.б. от 1 до " + maxCommandNumber);
        }
        return Integer.parseInt(userText);
    }

    private boolean isUserTextCorrect(String userText) {
        int userCommandNumber;

        try{
            userCommandNumber = Integer.parseInt(userText);
        } catch (NumberFormatException e) {
            return false;
        }
        return userCommandNumber > 0 && userCommandNumber <= maxCommandNumber;
    }

    abstract void commandExecute();
}
