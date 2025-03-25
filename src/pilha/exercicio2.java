package pilha;

import java.util.*;

	public class exercicio2 {
		


		public static void main(String[] args) {
			
	Scanner entrada = new Scanner(System.in);
			
			Stack<String> pilha = new Stack<String>();
			
			int escolha;
			boolean decisao=false;
			String nomeLivro;
			
			
			
			do {
			System.out.println("*********************************");
			System.out.println("     Selecione uma açao: \n1-Adicionar livro a pilha \n2-Listar livros na pilha \n3-Retirar livro da pilha \n0-Sair");
			System.out.println("*********************************");
			
			escolha = entrada.nextInt();
			
			switch(escolha) {
			
			
			case 1: System.out.println("Nome do livro: ");
					
					nomeLivro = entrada.next();
					System.out.println("\n");
					
					pilha.push(nomeLivro);
					
					 Iterator<String> iterator = pilha.iterator();
					
					while( iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					
					System.out.println("Livro adicionado!!");
					
					decisao = true;
				break;
				
				
			case 2:
				System.out.println("\nLista de livros na pilha: ");
				
				Iterator<String> lista = pilha.iterator();
				while( lista.hasNext()) {
					System.out.println(lista.next());
				}
				break;
				
				
			case 3:
				if(pilha.isEmpty()==true) { System.out.println("A pilha esta vazia."); decisao= true;}
				else {
					pilha.pop();
			
				System.out.println("\nLista de livros na piha: \n**");
				
				Iterator<String> iLista = pilha.iterator();
				while( iLista.hasNext()) {
					System.out.println(iLista.next());}
				decisao = true;
				
				System.out.println("!!!!Livor retirado da pilha!!!!");
				
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




