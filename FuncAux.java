import javafx.beans.binding.ObjectExpression;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class FuncAux {
    //logica de calculo
    public Object calcular( int op1, int op2, String entrada ) {

        int resultado = -1 ;
        int operador1 = op1;
        int operador2 = op2;

        switch (entrada) {
            case "+":
                return operador2 + operador1;
            case "-":
                return operador2 - operador1;

            case "*":
                return operador2 * operador1;
            
            case "/":
                if(operador1 == 0){
                    return -1;
                }
                return operador2 / operador1;
        }
        return resultado;
    }

    public String lerArquivo( String diretorio ) {
        Path caminho = Paths.get(diretorio);
        try{

            byte[] texto = Files.readAllBytes(caminho);
            String arquivo = new String(texto);
            return arquivo;

        } catch ( Exception error) {
            return "erro";
        }
    }

}
