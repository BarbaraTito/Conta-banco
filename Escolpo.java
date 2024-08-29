public class Escolpo {
     //\\ escolpo pode ser entendido como o ambiente que uma variavel é acessada\\
    
    double = saldo=10.0;

    public void sacar(Double valor){
        //variavel do metodo local
        double novoSaldo = saldo - valor;
    }


        public void imprimirSaldo (){
            System.out.println(saldo);
        
            // disponivel em toda classe
            System.out.printls(novoSaldo);
        }
        public double calcularDividaExponencial(){
         //varialvel local de metodo
         double valorParcela = 50.0;
         double valorMontante = 0.0;
         for(int x=1; x<=5; x++){
            double valorCalculado = valorParcela *x;
            valorMontante = valorMontante + valorCalculado;
         }  
         return valorMontante; 
        }
}
