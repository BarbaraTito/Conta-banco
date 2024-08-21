public class NumeroContas {


    public static void main(String[] args) {

        String numeroAgencia = " 1021";
        String numeroConta = " 067-8";
        
        String contaBanco = contaBanco (numeroAgencia, numeroConta);
        System.out.print(contaBanco);


       
    }

    public static String contaBanco (String numeroAgencia, String numeroConta){
        return "Conta Corrente "+ numeroAgencia.concat(" ").concat(numeroConta);
    }


     // Nome do banco, com frase inicial ok
        
       //Agencia numeroAgencia = new Agencia(1021);
        //Conta numeroConta = new Conta(067-8);



         //Nome = "MARIO ANDRADE";
         ///int numeroConta = 1021;
         //String  conta = new Conta(067-8);
         //double = 273.48
    
    
}
