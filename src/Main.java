import utils.Calculator;
import utils.Utilities;

import java.io.IOException;

import static utils.Constants.*;

public class Main {
    private static final Utilities utils = new Utilities();

    public static void main(String[] args) {
        int str;
        int dex;
        int con;
        int intelligence;
        int wis;
        int cha;
        String[] stats;

        System.out.println("This tool is made by " + ANSI_GREEN + "TerabyteTB" + ANSI_RESET + ".");
        System.out.println("The current build version is " + ANSI_GREEN + BUILD_VERSION + ANSI_RESET + ".");
        System.out.println("You can find this project at " + GITHUB_REPOSITORY_ADDRESS + ".");

        try {
            str = utils.promptStat("Please enter your character's Strength statistic:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            dex = utils.promptStat("Please enter your character's Dexterity statistic:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            con = utils.promptStat("Please enter your character's Constitution statistic:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            intelligence = utils.promptStat("Please enter your character's Intelligence statistic:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            wis = utils.promptStat("Please enter your character's Wisdom statistic:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            cha = utils.promptStat("Please enter your character's Charisma statistic:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stats = Calculator.modCalc(str, dex, con, intelligence, wis, cha);

        for (int i = 0; i < PRIM_STATS; i++) {
            switch (i) {
                case 0 -> System.out.println("Your character's Strength modifier is: " + stats[0]);
                case 1 -> System.out.println("Your character's Dexterity modifier is: " + stats[1]);
                case 2 -> System.out.println("Your character's Constitution modifier is: " + stats[2]);
                case 3 -> System.out.println("Your character's Intelligence modifier is: " + stats[3]);
                case 4 -> System.out.println("Your character's Wisdom modifier is: " + stats[4]);
                case 5 -> System.out.println("Your character's Charisma modifier is: " + stats[5]);
                default ->
                        throw new IllegalStateException("(How did this happen anyways? This is literally a For loop) Unexpected value: " + i);
            }
        }
    }
}