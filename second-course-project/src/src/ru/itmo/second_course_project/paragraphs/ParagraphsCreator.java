package src.ru.itmo.second_course_project.paragraphs;

import java.util.HashSet;

public class ParagraphsCreator {
    private static HashSet<Paragraph> paragraphs;

    ParagraphsCreator() { }

    static {
        paragraphsInitialization();
    }

    private static void paragraphsInitialization() {
        Paragraph littleFox = new Paragraph(ParagraphsInfo.LITTLE_FOX_TITLE, ParagraphsInfo.LITTLE_FOX_TEXT,
                ParagraphsInfo.LITTLE_FOX_MENU_FIRST, ParagraphsInfo.LITTLE_FOX_MENU_SECOND);

        Paragraph backToHome = new Paragraph(ParagraphsInfo.BACK_TO_HOME_TITLE, ParagraphsInfo.BACK_TO_HOME_TEXT);

        Paragraph startSearching = new Paragraph(ParagraphsInfo.START_SEARCHING_TITLE, ParagraphsInfo.START_SEARCHING_TEXT,
                ParagraphsInfo.START_SEARCHING_MENU_FIRST, ParagraphsInfo.START_SEARCHING_MENU_SECOND);

        Paragraph askForestDwellers = new Paragraph(ParagraphsInfo.ASK_FOREST_DWELLERS_TITLE,
                ParagraphsInfo.ASK_FOREST_DWELLERS_TEXT, ParagraphsInfo.ASK_FOREST_DWELLERS_MENU_FIRST,
                ParagraphsInfo.ASK_FOREST_DWELLERS_MENU_SECOND);

        Paragraph searchAlone = new Paragraph(ParagraphsInfo.SEARCH_ALONE_TITLE, ParagraphsInfo.SEARCH_ALONE_TEXT);

        Paragraph askOwl = new Paragraph(ParagraphsInfo.ASK_OWL_TITLE, ParagraphsInfo.ASK_OWL_TEXT,
                ParagraphsInfo.ASK_OWL_MENU_FIRST, ParagraphsInfo.ASK_OWL_MENU_SECOND);

        Paragraph askWolf = new Paragraph(ParagraphsInfo.ASK_WOLF_TITLE, ParagraphsInfo.ASK_WOLF_TEXT,
                ParagraphsInfo.ASK_WOLF_MENU_FIRST, ParagraphsInfo.ASK_WOLF_MENU_SECOND);

        Paragraph trustOwl = new Paragraph(ParagraphsInfo.TRUST_OWL_TITLE, ParagraphsInfo.TRUST_OWL_TEXT,
                ParagraphsInfo.TRUST_OWL_MENU_FIRST, ParagraphsInfo.TRUST_OWL_MENU_SECOND);

        Paragraph getHoney = new Paragraph(ParagraphsInfo.GET_HONEY_TITLE, ParagraphsInfo.GET_HONEY_TEXT,
                ParagraphsInfo.GET_HONEY_MENU_FIRST, ParagraphsInfo.GET_HONEY_MENU_SECOND);

        Paragraph waitBeesFlyAway = new Paragraph(ParagraphsInfo.WAIT_BEES_FLY_AWAY_TITLE,
                ParagraphsInfo.WAIT_BEES_FLY_AWAY_TEXT, ParagraphsInfo.WAIT_BEES_FLY_AWAY_MENU_FIRST,
                ParagraphsInfo.WAIT_BEES_FLY_AWAY_MENU_SECOND);

        Paragraph stealHoney = new Paragraph(ParagraphsInfo.STEAL_HONEY_TITLE, ParagraphsInfo.STEAL_HONEY_TEXT);

        Paragraph eatAndRelax = new Paragraph(ParagraphsInfo.EAT_AND_RELAX_TITLE, ParagraphsInfo.EAT_AND_RELAX_TEXT);

        Paragraph takeHoneyToBear = new Paragraph(ParagraphsInfo.TAKE_HONEY_TO_BEAR_TITLE,
                ParagraphsInfo.TAKE_HONEY_TO_BEAR_TEXT, ParagraphsInfo.TAKE_HONEY_TO_BEAR_MENU_FIRST,
                ParagraphsInfo.TAKE_HONEY_TO_BEAR_MENU_SECOND);

        littleFox.setFirstAnswer(backToHome);
        littleFox.setSecondAnswer(startSearching);

        startSearching.setFirstAnswer(askForestDwellers);
        startSearching.setSecondAnswer(searchAlone);

        askForestDwellers.setFirstAnswer(askOwl);
        askForestDwellers.setSecondAnswer(askWolf);

        askOwl.setFirstAnswer(trustOwl);
        askOwl.setSecondAnswer(searchAlone);

        askWolf.setFirstAnswer(backToHome);
        askWolf.setSecondAnswer(searchAlone);

        trustOwl.setFirstAnswer(searchAlone);
        trustOwl.setSecondAnswer(getHoney);

        getHoney.setFirstAnswer(waitBeesFlyAway);
        getHoney.setSecondAnswer(stealHoney);

        waitBeesFlyAway.setFirstAnswer(eatAndRelax);
        waitBeesFlyAway.setSecondAnswer(takeHoneyToBear);

        takeHoneyToBear.setFirstAnswer(searchAlone);
        takeHoneyToBear.setSecondAnswer(backToHome);

        paragraphs.add(littleFox);
        paragraphs.add(backToHome);
        paragraphs.add(startSearching);
        paragraphs.add(askForestDwellers);
        paragraphs.add(searchAlone);
        paragraphs.add(askOwl);
        paragraphs.add(askWolf);
        paragraphs.add(trustOwl);
        paragraphs.add(getHoney);
        paragraphs.add(waitBeesFlyAway);
        paragraphs.add(stealHoney);
        paragraphs.add(eatAndRelax);
        paragraphs.add(takeHoneyToBear);
    }

    public static HashSet<Paragraph> getParagraphsSet() {
        return paragraphs;
    }
}
