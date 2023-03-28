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

                String op1 = (String) p.desempilhar();
                String op2 = (String) p.desempilhar();
                
                System.out.println( funcao.calcular(op1, op2, entrada) );
            } else {
                p.empilhar(entrada);
                System.out.println("emplilhado " + entrada);

            }
        }
    }
}
