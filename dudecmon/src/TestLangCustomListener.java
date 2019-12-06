

import java.io.*;
import java.io.FileWriter;
import java.io.File;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class TestLangCustomListener extends TestLangBaseListener {
    @Override
    public void enterProgram(TestLangParser.ProgramContext ctx) {
        try
        {
            System.out.println("PROGRAM");
            File file = new File("testlang.j");
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            out.append(".class public TestLang");
            out.append("\n");
            out.append(".super java/lang/Object");
            out.append("\n\n");

            out.append(".method public <init>()V");
            out.append("\n");
            out.append("aload_0");
            out.append("\n");
            out.append("invokespecial java/lang/Object/<init>()V");
            out.append("\n");
            out.append("return");
            out.append("\n");
            out.append(".end method");
            out.append("\n\n");
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }

    }
}
