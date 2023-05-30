import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class tradutor extends gramaticaBaseListener{

   public static void main(String[] args) throws IOException {
        String codigo = new String(Files.readAllBytes(Paths.get("codigo.txt")), StandardCharsets.UTF_8);

        gramaticaLexer lexer = new gramaticaLexer(CharStreams.fromString(codigo));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramaticaParser parser = new gramaticaParser(tokens);
        tradutor listener = new tradutor();
        ParseTreeWalker.DEFAULT.walk(listener, parser.init());
    }

   public void enterInit(gramaticaParser.InitContext ctx) { 
        System.out.println("import java.util.Scanner;");
        System.out.println("public class Codigo{");
        System.out.println("public static void main(String[] args){");
        System.out.println("Scanner scanner = new Scanner(System.in);");
    }
    
    public void exitInit(gramaticaParser.InitContext ctx) { 
        System.out.println("scanner.close();\n}");
        System.out.println("\n}");
    }

    public void enterVariavel(gramaticaParser.VariavelContext ctx) { 
        System.out.print(ctx.getText());
    }

    public void enterNumero(gramaticaParser.NumeroContext ctx) { 
        System.out.print(ctx.getText());
    }

    public void enterDefinicao(gramaticaParser.DefinicaoContext ctx) { 
        System.out.print("= ");
    }

    public void enterMais(gramaticaParser.MaisContext ctx) { 
        System.out.print("+ ");
    }

    public void enterDivisao(gramaticaParser.DivisaoContext ctx) { 
        System.out.print("/ ");
    }

    public void enterMultiplicacao(gramaticaParser.MultiplicacaoContext ctx) { 
        System.out.print("* ");
    }

    public void enterMenos(gramaticaParser.MenosContext ctx) { 
        System.out.print("- ");
    }

    public void enterMaior_que(gramaticaParser.Maior_queContext ctx) {
        System.out.print(" > ");
     }

     public void enterMenor_que(gramaticaParser.Menor_queContext ctx) { 
        System.out.print(" < ");
     }

     public void enterMaior_igual(gramaticaParser.Maior_igualContext ctx) { 
        System.out.print(" >= ");
     }

     public void enterMenor_igual(gramaticaParser.Menor_igualContext ctx) { 
        System.out.print(" <= ");
     }
    
     public void enterIgual(gramaticaParser.IgualContext ctx) { 
        System.out.print(" = ");
     }

     public void enterIgual_duplo(gramaticaParser.Igual_duploContext ctx) { 
        System.out.print(" == ");
     }

     public void enterInteiro(gramaticaParser.InteiroContext ctx) { 
        System.out.print("int ");
     }

     public void enterReal(gramaticaParser.RealContext ctx) {
        System.out.print("double ");
      }

     public void enterTexto(gramaticaParser.TextoContext ctx) { 
        System.out.print("String ");
      }
     public void enterEnd(gramaticaParser.EndContext ctx) {
        System.out.print("; \n");
     }
     
     public void enterSe(gramaticaParser.SeContext ctx) { 
        System.out.print("if ");
     }

     public void enterEqt(gramaticaParser.EqtContext ctx) { 
        System.out.print("while ");
     }

     public void enterPr(gramaticaParser.PrContext ctx) { 
        System.out.print("for ");  
     }

     public void enterSenao(gramaticaParser.SenaoContext ctx) { 
         System.out.print("else ");   
     }

     public void enterSenao_se(gramaticaParser.Senao_seContext ctx) { 
         System.out.print("else if ");
     }

      public void enterAbre_bloco(gramaticaParser.Abre_blocoContext ctx) { 
        System.out.print("{ \n");
      }

      public void enterFecha_bloco(gramaticaParser.Fecha_blocoContext ctx) { 
        System.out.print("} \n");
      }

      public void enterDivisor(gramaticaParser.DivisorContext ctx) { 
        System.out.print("; ");
      }

      public void enterAbre_prt(gramaticaParser.Abre_prtContext ctx){
        System.out.print("(");
      }

      public void enterFecha_prt(gramaticaParser.Fecha_prtContext ctx) { 
        System.out.print(")"); 
      }

      public void enterString(gramaticaParser.StringContext ctx) {
        System.out.print(ctx.getText()); 
      }

      public void enterPrinta(gramaticaParser.PrintaContext ctx) {
        System.out.print("System.out.println"); 
      }

      public void enterDuplo_mais(gramaticaParser.Duplo_maisContext ctx) { 
            System.out.print("++");
      }

      @Override public void enterLeitura_i(gramaticaParser.Leitura_iContext ctx) { 
            System.out.print("scanner.nextInt(); \n");
      }

      @Override public void enterLeitura_s(gramaticaParser.Leitura_sContext ctx) { 
            System.out.print("scanner.nextLine(); \n");
      }

      @Override public void enterLeitura_r(gramaticaParser.Leitura_rContext ctx) { 
            System.out.print("scanner.nextDouble(); \n");
      }

}
   
   

