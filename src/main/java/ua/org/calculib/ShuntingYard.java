package ua.org.calculib;

/**
 * Created by Anton Goi on 11.10.2014.
 */
public class ShuntingYard {

    private ShuntingYard() {
    }

    private static ShuntingYard shuntingYard;

    public static ShuntingYard getInstance() {
        if (shuntingYard == null) shuntingYard = new ShuntingYard();
        return shuntingYard;
    }

    private static String optimizeSpaces(String expression) {
        String result = "";
        char[] chars = expression.trim().replace(',', '.').toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c) || Character.isLetter(c) || c == '.') result += c;
            else if (c == ' ') continue;
            else
                result += " " + c + " ";
        }
//        while (result.indexOf("  ") != -1) result.replaceAll("  ", " ");
        return result.trim();
    }

}
