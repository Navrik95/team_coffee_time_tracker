package teamcoffee.accountant.util;

import java.io.BufferedReader;
import java.io.IOException;

public class RequestParser {

    private static final String PATTERN = ".+\\d+$";

    public static boolean requestHasId(String uri){
        return uri.matches(PATTERN);
    }

    public static int parseIdFromRequest(String uri) {
        String[] elements = uri.split("/");
        return Integer.parseInt(elements[elements.length-1]);
    }

    public static String readJsonFromRequest(BufferedReader reader)
            throws IOException {
        StringBuilder builder = new StringBuilder();
        String temp;
        while ((temp = reader.readLine()) != null){
            builder.append(temp.trim());
            builder.append("\s");
        }
        return builder.toString();
    }
}
