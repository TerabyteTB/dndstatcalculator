package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static utils.Constants.ANSI_RED;
import static utils.Constants.ANSI_RESET;

public class Utilities {
    public int getStatMod(int stat) {
        return (int) Math.floor((stat - 10.0) / 2.0);
    }

    public String readFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        return reader.readLine();
    }

    public int promptStat(String prompt) throws IOException {
        System.out.println(prompt);
        String answer = this.readFromConsole();

        try {
            return Integer.parseInt(answer);
        } catch (NumberFormatException e) {
            System.out.println(ANSI_RED + "Please enter only numbers." + ANSI_RESET);
            promptStat(prompt);
        }
        //unreachable return statement
        return 0;
    }

    public boolean promptBoolean(String prompt) throws IOException {
        System.out.println(prompt);
        String answer = this.readFromConsole();

        switch (answer){
            case "y" -> {
                return true;
            }
            case "n" -> {
                return false;
            }
            default -> {
                System.out.println(ANSI_RED + "Please only answer with y/n." + ANSI_RESET);
                promptStat(prompt);
            }
        }
        //unreachable return statement.
        return false;
    }
}
