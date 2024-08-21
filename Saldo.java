public class Saldo{

	public static void main(String[] args) {
		// saldo

		double saldo = 25.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado < saldo){

        saldo = saldo - valorSolicitado; 
        System.out.print("Novo Saldo: " + saldo);
 }else
        System.out.print("Saldo Insulficiente");

	}
}
