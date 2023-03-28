import java.util.Scanner;



import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Pilha p = new Pilha();
        FuncAux funcao = new FuncAux();

        //lista de operadores basicos
        String [] operadores = new String[] {"+", "-", "*", "/"};
        List<String> operador = Arrays.asList(operadores);
        String ArquivoValue = funcao.lerArquivo("./Calc1.stk");

        while(true){
            String entrada = scan.nextLine();


            if(operador.contains(entrada)) {
                
                Object op1 = p.desempilhar();
                Object op2 = p.desempilhar();

                int operador1 = Integer.parseInt(op1.toString());
                int operador2 = Integer.parseInt(op2.toString());

                // calcular e transformar o resultadado para int
                int resultadoCalculado = Integer.parseInt(funcao.calcular(operador1, operador2, entrada).toString());
                p.empilhar(resultadoCalculado);

                System.out.println("Resultado: " + p.exibeUltimoValor());
            } else {
                // sempre empilhar int
                int valor = Integer.parseInt(entrada);
                p.empilhar(valor);
            }
        }
    }
}
