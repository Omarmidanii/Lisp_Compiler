// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import antler.LISPlexer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
public class Main {
    public static void main(String[] args) {
        String input = "(print Hello)";

        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        LISPlexer lexer = new LISPlexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        // Get tokens
        tokenStream.fill();
        for (Token token : tokenStream.getTokens()) {
            System.out.println(token.toString());
        }
    }
}