import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main (String [] args) {
			
		Cliente cliente1 = new Cliente(); 
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		cliente1.setNome("Lucas"); 
		cliente1.setCpf("12345678960"); 
		
		cliente2.setNome("Katia");
		cliente2.setCpf("98765432112");
		
		cliente3.setNome("Fernanda");
		cliente3.setCpf ("12378945654");
		
		Conta cpCliente1 = new ContaPoupanca(cliente1);		
		Conta ccCliente2 = new ContaCorrente(cliente2); 
		Conta ccCliente3 = new ContaCorrente(cliente3);
		
		cpCliente1.depositar(590); 		
		cpCliente1.transferir(285, ccCliente2);
		ccCliente3.depositar(124);
				
		cpCliente1.imprimirExtrato(); 
		ccCliente2.imprimirExtrato();
		ccCliente3.imprimirExtrato(); 
	}
}






/*
 * //######################################################## ArrayList<Cliente>
 * Clientes = new ArrayList();
 * 
 * 
 * Clientes.add(new Cliente ("Lucas")); 
 * Clientes.add(new Cliente ("Rodrigues"));
 * Clientes.add(new Cliente ("Dias"));
 * 
 * 
 * //for (Cliente Cliente : Clientes) {System.out.println(Cliente);} for
 * (Cliente Cliente : Clientes) {System.out.println(Cliente.getNome());}
 * 
 * for (int i = 0; i < Clientes.size(); i++) {
 * //System.out.println(Cliente.get(i)); }
 * //########################################################
 */
