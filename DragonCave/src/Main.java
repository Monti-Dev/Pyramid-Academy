public class Main {

    public static void main(String[] args) {
        Interface ui = new Interface();
        Cave cave = new Cave();
        boolean playAgain = true;

        while (playAgain) {
            ui.displayIntro();
            int choice = ui.chooseCave();
            boolean isPlayerWin = cave.resolveChoice(choice);
            ui.showResult(isPlayerWin);

            playAgain = ui.isPlayAgain();

            if (playAgain) {
                ui.flushScreen();

            }

        }

    }

}