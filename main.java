import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String args[]) {
        Pilha p = new Pilha();
        FuncAux funcao = new FuncAux();

        //lista de operadores basicos
        String [] operadores = new String[] {"+", "-", "*", "/"};
        List<String> operador = Arrays.asList(operadores);
        File arquivo = new File("./Calc1.stk");

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String entrada;
            while ((entrada = leitor.readLine()) != null) {
                if(operador.contains(entrada)) {
                
                    int operador1 = Integer.parseInt(p.desempilhar().toString());
                    int operador2 = Integer.parseInt(p.desempilhar().toString());

                    // calcular e transformar o resultadado para int
                    int resultadoCalculado = Integer.parseInt(funcao.calcular(operador1, operador2, entrada).toString());
                    p.empilhar(resultadoCalculado);
    
                    System.out.println("Resultado: " + p.exibeUltimoValor());
                } else {
                    // sempre empilhar valor tipo int
                    int valor = Integer.parseInt(entrada);
                    p.empilhar(valor);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
