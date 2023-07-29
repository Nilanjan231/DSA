class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
     List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i + 1;
            int lineLength = words[i].length();

            // Find words that can fit in the current line
            while (j < words.length && lineLength + words[j].length() + (j - i - 1) < maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            int spaces = maxWidth - lineLength;
            int gaps = j - i - 1;
            StringBuilder line = new StringBuilder(words[i]);

            // If it's the last line or only one word, left-justify the line
            if (j == words.length || gaps == 0) {
                for (int k = i + 1; k < j; k++) {
                    line.append(" ").append(words[k]);
                }
                addSpaces(line, spaces - gaps);
            } else {
                // Distribute spaces evenly for fully justified lines
                int spacesBetweenWords = spaces / gaps;
                int extraSpaces = spaces % gaps;
                for (int k = i + 1; k < j; k++) {
                    int spacesToAdd = spacesBetweenWords + (extraSpaces > 0 ? 1 : 0);
                    addSpaces(line, spacesToAdd);
                    extraSpaces--;
                    line.append(words[k]);
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }

    private static void addSpaces(StringBuilder sb, int count) {
        for (int i = 0; i < count; i++) {
            sb.append(" ");
        }
    }
}