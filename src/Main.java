import calc.Calculator;

import static calc.Calculator.PRIM_STATS;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < PRIM_STATS; i++)
            System.out.println(Calculator.modCalc(10, 12, 8, 35, 13, 6)[i]);
    }
}