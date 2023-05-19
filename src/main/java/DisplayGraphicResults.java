public class DisplayGraphicResults extends DisplayResults{

    public void takeawayLives(){
        remainingLives -= 1;
    }

    @Override
    public int getRemainingLives() {
        switch (remainingLives) {

            case 8:
                System.out.println(" _");
                System.out.println(" |      ");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_________");

                break;

            case 7:
                System.out.println(" _______");
                System.out.println(" |      ");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_________");

                break;
            case 6:
                System.out.println(" ________");
                System.out.println(" |      |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_________");

                break;

            case 5:
                System.out.println(" ________");
                System.out.println(" |      |");
                System.out.println(" |      O");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_________");
                break;
            case 4:
                System.out.println(" ________");
                System.out.println(" |      |");
                System.out.println(" |      O");
                System.out.println(" |      |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_________");
                break;
            case 3:
                System.out.println(" ________");
                System.out.println(" |      |");
                System.out.println(" |      O");
                System.out.println(" |     /|");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_________");
                break;
            case 2:
                System.out.println(" ________");
                System.out.println(" |      |");
                System.out.println(" |      O");
                System.out.println(" |     /|\\");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_________");
                break;
            case 1:
                System.out.println(" ________");
                System.out.println(" |      |");
                System.out.println(" |      O");
                System.out.println(" |     /|\\");
                System.out.println(" |     /");
                System.out.println(" |");
                System.out.println("_|_________");
                break;
            case 0:
                System.out.println(" ________");
                System.out.println(" |      |");
                System.out.println(" |      O");
                System.out.println(" |     /|\\");
                System.out.println(" |     / \\");
                System.out.println(" |");
                System.out.println("_|_________");
                break;
        }

        return super.getRemainingLives();
    }
}
