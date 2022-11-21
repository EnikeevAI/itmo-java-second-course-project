package ru.itmo.second_course_project.application_items.paragraphs;

public class Paragraph {
    private String title;
    private String text;
    private String menuFirstText;
    private String menuSecondText;
    Paragraph firstAnswer;
    Paragraph secondAnswer;

    public Paragraph(String title, String text) {
        setTitle(title);
        setText(text);
    }

    protected Paragraph(String title, String text, String menuFirstText, String menuSecondText) {
        setTitle(title);
        setText(text);
        setMenuFirstText(menuFirstText);
        setMenuSecondText(menuSecondText);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("Поле tile у параграфа не может быть пустым");
        this.title = title;
    }

    public void printText() {
        System.out.println();
        System.out.println(text);
    }

    private void setText(String text) {
        if (text == null) throw new IllegalArgumentException("Поле text у параграфа не может быть пустым");
        this.text = text;
    }

    public String getMenuFirstText() {
        return menuFirstText;
    }

    private void setMenuFirstText(String menuFirstText) {
        this.menuFirstText = menuFirstText;
    }

    public String getMenuSecondText() {
        return menuSecondText;
    }

    private void setMenuSecondText(String menuSecondText) {
        this.menuSecondText = menuSecondText;
    }

    public Paragraph getFirstAnswer() {
        return firstAnswer;
    }

    protected void setFirstAnswer(Paragraph firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public Paragraph getSecondAnswer() {
        return secondAnswer;
    }

    protected void setSecondAnswer(Paragraph secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    public boolean isLastParagraph() {
        return getFirstAnswer() == null;
    }
}
