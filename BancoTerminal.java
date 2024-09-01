public class BancoTerminal{


    public static void main (String[] args) {

            //variavel da classe conta
            
                //Nome do Banco e mensagem de inicio
                
                String meu = "Novo";
                String bancoSim="Povo";
                String primeiroNome = "Mario";
                String segundoNome = "Andrade";
        
                String nomeBanco = nomeBanco (meu,bancoSim);
                System.out.print(nomeBanco);

                String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
                System.out.print(nomeCompleto);
                
    }
    
            
        public static String nomeBanco (String meu, String bancoSim){
            return "Bem Vindo ao Banco "+ meu.concat(" ").concat(bancoSim);
        } 
        
        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return " Cliente "  + primeiroNome.concat(" ").concat(segundoNome);
        }
        
}
        
        
        

        // Nome do banco, com frase inicial ok
        
       //Agencia numeroAgencia = new Agencia(1021);
        //Conta numeroConta = new Conta(067-8);



         //Nome = "MARIO ANDRADE";
         ///int numeroConta = 1021;
         //String  conta = new Conta(067-8);
         //double = 273.48
    




