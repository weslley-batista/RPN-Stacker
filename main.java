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


        boolean lendo = true;
        while(lendo){
            String entrada = scan.nextLine();

            if(operador.contains(entrada)) {
                
                System.out.println("entrou no if");

                Object op1 = p.desempilhar();
                Object op2 = p.desempilhar();

                int operador1 = Integer.parseInt(op1.toString());
                int operador2 = Integer.parseInt(op2.toString());

                int resultadoCalculado = Integer.parseInt(funcao.calcular(operador1, operador2, entrada).toString());
                p.empilhar(resultadoCalculado);

                System.out.println("Resultado: " + p.exibeUltimoValor());
            } else {
                int valor = Integer.parseInt(entrada);
                p.empilhar(valor);
                System.out.println("emplilhado " + valor);

            }
        }
    }
}
