import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*; 

public class Compilador{

  public static void main(String[] args)throws Exception{

    CharStream input = CharStreams.fromStream(System.in);
    gramaticaLexer lexer = new gramaticaLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    gramaticaParser parser = new gramaticaParser(tokens);
    ParseTree tree = parser.init();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(new tradutor(), tree);

    System.out.println("");
  }
}
