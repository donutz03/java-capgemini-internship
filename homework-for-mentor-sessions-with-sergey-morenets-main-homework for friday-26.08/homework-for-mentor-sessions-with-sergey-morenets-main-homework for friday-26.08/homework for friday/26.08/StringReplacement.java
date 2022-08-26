package capgemini.lecture1;

public class StringReplacement {

    /**
     * Transforms string by these rules:
     * AB -> ""
     * CD -> ""
     * ABC -> C
     * ABCD -> CD -> ""
     * CABBAD -> CBAD -> CD -> ""
     *
     * @param text Contains only A, B, C or D characters
     * @return
     */
    public static String replace(String text) {
        ArrayList<String> miniStrings = new ArrayList<>();
        miniStrings.add("AB");
        miniStrings.add("BA");
        miniStrings.add("DC");
        miniStrings.add("CD");
        for (String string: miniStrings) {
        while (text.contains(string)) {
            text.replace(string, "");
        }
        }
        return text;
    }
}






