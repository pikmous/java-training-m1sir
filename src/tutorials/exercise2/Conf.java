package tutorials.exercise2;

class Conf {

    /*
     * All Strings related to the system and the program.
      * This section doesn't provide data directly to the user.
      * Variables declared here are is intended to
     */
    static final String
            HELP_FILE = "./src/tutorials/exercise2/help.txt",
            SYSTEM_CLEAR_COMMAND = "clear";

    static final String
            PROMPT = "> ",
            TRIANGLE_SIZE_INPUT_MESSAGE = "\nDonne moi la taille du triangle (%d essai restant): ",
            TRIANGLE_SIZE_SUMMARY = "\nTu as choisi de dessiner un triangle dont le coté mesure %d lignes",
            QUIT_MESSAGE = "Au revoir !",
            ORIENTATION_CHOICE_INPUT = "\nDonne moi le choix de l’orientation (0 = BAS et 1 = HAUT): ",
            UPWARD_ORIENTATION = "haut",
            DOWNWARD_ORIENTATION = "bas",
            TRIANGLE_DRAWING_SUMMARY = "\nHoola je vous dessine un triangle oriente vers le %s de taille = %d\n";

    static final int
            TRIANGLE_MAX_SIZE = 10,
            TRIANGLE_MIN_SIZE = 3,
            TEST_COUNTER = 3,
            DOWNWARD_TRIANGLE_CHOICE = 0,
            UPWARD_TRIANGLE_CHOICE = 1;

}

