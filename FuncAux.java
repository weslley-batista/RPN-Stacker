public class FuncAux {

    public int calcular( String op1, String op2, String entrada ) {

        System.out.println("Entrou na função calcular");
        int resultado = -1 ;
        int operador1 = Integer.parseInt(op1);
        int operador2 = Integer.parseInt(op2);


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
