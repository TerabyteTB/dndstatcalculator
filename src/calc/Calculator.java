package calc;

public class Calculator {
    public static int PRIM_STATS = 6;

    private static int statMod(int stat) {
        return (int) Math.floor((stat - 10.0) / 2.0);
    }
    public static int[] modCalc(int str, int dex, int con, int intelligence, int wis, int cha) {
        int strMod = statMod(str);
        int dexMod = statMod(dex);
        int conMod = statMod(con);
        int intMod = statMod(intelligence);
        int wisMod = statMod(wis);
        int chaMod = statMod(cha);

        return new int[]{strMod, dexMod, conMod, intMod, wisMod, chaMod};
    }
}
