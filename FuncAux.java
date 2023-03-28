import javafx.beans.binding.ObjectExpression;

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
}
