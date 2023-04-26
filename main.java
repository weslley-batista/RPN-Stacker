import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Pilha p = new Pilha();
        FuncAux funcao = new FuncAux();

        //lista de operadores basicos
        String [] operadores = new String[] {"+", "-", "*", "/"};
        List<String> operador = Arrays.asList(operadores);
        File arquivo = new File("./Calc1.stk");
        ArrayList<String> tokens = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String entrada;
            while ((entrada = leitor.readLine()) != null) {
                Token token;
                
                if(operador.contains(entrada)) {
                    int operador1 = Integer.parseInt(p.desempilhar().toString());
                    int operador2 = Integer.parseInt(p.desempilhar().toString());

                    if (entrada.equals("+")) {
                        token = new Token(TokenType.PLUS, entrada);
                        tokens.add(token.toString());
                    } else if (entrada.equals("-")) {
                        token = new Token(TokenType.MINUS, entrada);
                        tokens.add(token.toString());
                    } else if (entrada.equals("/")) {
                        token = new Token(TokenType.SLASH, entrada);
                        tokens.add(token.toString());
                    } else if (entrada.equals("*")) {
                        token = new Token(TokenType.STAR, entrada);
                        tokens.add(token.toString());
                    }
                    
                    // calcular e transformar o resultadado para int
                    int resultadoCalculado = Integer.parseInt(funcao.calcular(operador1, operador2, entrada).toString());
                    p.empilhar(resultadoCalculado);
    
                } else {
                    // sempre empilhar valor tipo int
                    int valor = Integer.parseInt(entrada);
                    p.empilhar(valor);

                    token = new Token(TokenType.NUM, entrada);
                    tokens.add(token.toString());
                }
            }

            for (int i = 0; i < tokens.size(); i++) {
                String elemento = tokens.get(i);
                System.out.println(elemento);
            }
            
            System.out.println("-----");
            
            System.out.println("Resultado: " + p.exibeUltimoValor());
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());            
        }
    }
}
