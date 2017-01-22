package com.eliaswalyba.m1sir.tutorials.practice1.exercise2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class TestTriangle
{
    /* ----------------------------------------------------------------------------------------
    * TestTriangle class
    * ----------------------------------------------------------------------------------------
    * This class is using the Triangle class to draw very beautiful and well shaped triangles.
    * It implements its logic by the help of the Conf class in the same package.
    * The Conf class is the data provider for this class.
    * All messages output by this class and all setting values used here are taken from the
    * Conf class.
    ------------------------------------------------------------------------------------------*/

    public static void main(String []args) {

        /*
         * We initialize some variables we'll need in this program.
         *
         * size : the size of the triangle to draw to the screen
         * orientation : the orientation chosen by the user
         * testCounter : the number of trials given to the user to input the size of the triangle
         * scanner : the scanner object that allows us to get input data from the user
         */
        int size = 0, orientation, testCounter = Conf.TEST_COUNTER;
        boolean pass = false;
        Scanner scanner = new Scanner(System.in);

        /* We clear the console and handle an eventually happening exception */
        try {
            clearConsole();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
         * We read and output the content of the help file
         * This file allows us to display to the user a helpful description of the program
         * and instructions on how to use it.
         */
        readTextFile(Conf.HELP_FILE);

        /*
         * In this bloc we ask the user give the program the size of the triangle.
         * The size may not be out of a defined interval which is currently set to [3, 10] but can change at anytime we want
         * This process loops testCounter times (3 times) before quitting if the user doesn't provide the correct value of size
         */
        while (testCounter != 0 && !pass) {
            System.out.println(String.format(Conf.TRIANGLE_SIZE_INPUT_MESSAGE, testCounter)); System.out.print(Conf.PROMPT);
            size = scanner.nextInt();
            if (size >= Conf.TRIANGLE_MIN_SIZE && size <= Conf.TRIANGLE_MAX_SIZE) {
                System.out.println(String.format(Conf.TRIANGLE_SIZE_SUMMARY, size));
                pass = true;
            } else testCounter--;
        }
        if (testCounter == 0) {
            System.out.print(Conf.PROMPT + Conf.QUIT_MESSAGE); System.exit(0);
        }

        /*
         * This bloc asks the user to choose an orientation.
          * Only two orientations are currently possible:
          *     - Upward orientation: the user may give the value of 1
          *     - Downward orientation: the user may give the value of 0
          * This bloc loops infinitely if the user doesn't provide a good value for the orientation
         */
        do {
           System.out.println(Conf.ORIENTATION_CHOICE_INPUT); System.out.print(Conf.PROMPT);
           orientation = scanner.nextInt();
        } while (orientation != 0 && orientation != 1);

        System.out.println(String.format(Conf.TRIANGLE_DRAWING_SUMMARY, (orientation == 1 ? Conf.UPWARD_ORIENTATION : Conf.DOWNWARD_ORIENTATION), size));

        /*
         * Now that we have all values correct we can create our Triangle object.
         * And draw a triangle oriented in the user's choice.
         */
        Triangle triangle = new Triangle(size);
        switch (orientation) {
            case Conf.DOWNWARD_TRIANGLE_CHOICE: triangle.drawDownwardTriangle(); break;
            case Conf.UPWARD_TRIANGLE_CHOICE: triangle.drawUpwardTriangle(); break;
            default: break;
        }
        System.out.println();
    }

    /**
     * Allows to clear the console screen.
     *
     * @throws IOException the type of exception this method might throw.
     */
    private static void clearConsole() throws IOException {
        Runtime.getRuntime().exec(Conf.SYSTEM_CLEAR_COMMAND);
    }

    /**
     * Allows to read a text file.
     * We use it this program to read the content of our help file.
     *
     * @param file String the path of the file to read
     */
    private static void readTextFile(String file) {
        String line;
        try {
            // FileReader allows to easily read a text file in java with the default encoding system.
            FileReader fileReader = new FileReader(file);

            // It is always safer to wrap a FileReader object in a BufferedReader one
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Writing to the default out stream system the content of the file
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Always close our BufferedReader object for memory safety.
            bufferedReader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

}
