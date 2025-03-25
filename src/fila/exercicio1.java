package fila;
import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int escolha;
		boolean decisao=false;
		String nomeCliente;
		
		
		
		do {
		System.out.println("*********************************");
		System.out.println("     Selecione uma açao: \n1-Adicionar cliente \n2-Listar clientes \n3-Retirar cliente da fila \n0-Sair");
		System.out.println("*********************************");
		
		escolha = entrada.nextInt();
		
		switch(escolha) {
		case 1: System.out.println("Nome da(o) cliente: ");
				
				nomeCliente = entrada.next();
				System.out.println("\n");
				
				fila.add(nomeCliente);
				
				Iterator<String> iterator = fila.iterator();
				
				while( iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				
				System.out.println("Cliente adicionado!!");
				
				decisao = true;
			break;
			
			
		case 2:
			System.out.println("\nLista de cientes na fila: ");
			
			Iterator<String> lista = fila.iterator();
			while( lista.hasNext()) {
				System.out.println(lista.next());
			}
			break;
			
			
		case 3:
			if(fila.isEmpty()==true) { System.out.println("A fila esta vazia."); decisao= true;}
			else {
				
			fila.remove();
			System.out.println("\nLista de cientes na fila: \n**");
			
			Iterator<String> iLista = fila.iterator();
			while( iLista.hasNext()) {
				System.out.println(iLista.next());}
			decisao= true;
			
			System.out.println("!!!!Cliente chamado para atendimento!!!!");
			
			}
			
			break;
		case 0: decisao = false;
			break;
		default:
			System.out.println("Opcao invalida uai!!!");
			
		}
		
		}while(decisao==true);
		
		System.out.print("******Programa finalizado******");
		System.exit(0);
	}

}
