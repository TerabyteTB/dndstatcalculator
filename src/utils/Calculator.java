package utils;

public class Calculator {
    private static final Utilities utils = new Utilities();

    public static String[] modCalc(int str, int dex, int con, int intelligence, int wis, int cha) {
        String strMod = Integer.toString(utils.getStatMod(str));
        String dexMod = Integer.toString(utils.getStatMod(dex));
        String conMod = Integer.toString(utils.getStatMod(con));
        String intMod = Integer.toString(utils.getStatMod(intelligence));
        String wisMod = Integer.toString(utils.getStatMod(wis));
        String chaMod = Integer.toString(utils.getStatMod(cha));

        return new String[] {strMod, dexMod, conMod, intMod, wisMod, chaMod};
    }
}
