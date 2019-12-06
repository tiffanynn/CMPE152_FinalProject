import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;


public class TestLang {
    public static void main(String[] args) {
        try {
            CharStream input = (CharStream) new ANTLRFileStream("test.txt");
            TestLangLexer lexer = new TestLangLexer(input);
            TestLangParser parser = new TestLangParser(new CommonTokenStream(lexer));
            parser.addParseListener(new TestLangCustomListener());
            parser.program();
        } catch (IOException ex) {
            Logger.getLogger(TestLang.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}

