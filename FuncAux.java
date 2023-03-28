import javafx.beans.binding.ObjectExpression;

public class FuncAux {

    public Object calcular( int op1, int op2, String entrada ) {

        System.out.println("Entrou na função calcular");
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
