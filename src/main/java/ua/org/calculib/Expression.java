package ua.org.calculib;

/**
 * Created by Anton Goi on 11.10.2014.
 */
public class Expression {

    public Expression() {
    }

    private static String optimizeSpaces(String expression) {
        String result = "";
        char[] chars = expression.trim().replace(',', '.').toCharArray();
        boolean ignoreLeftSpace = false;
        for (char c : chars) {
            if (Character.isDigit(c) || Character.isLetter(c) || c == '.') result += c;
            else if (c == ' ') continue;
            else {
                result += (ignoreLeftSpace ? "" : " ") + c + " ";
                ignoreLeftSpace = true;
                continue;
            }
            ignoreLeftSpace = false;
        }
//        while (result.indexOf("  ") != -1) result.replaceAll("  ", " ");
        return result.trim();
    }

}
