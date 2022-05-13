package Fila;
import java.util.LinkedList;
import java.util.Queue;

public class Fila <T> {
	
	/*/Suponha que em uma determinada loja, para pegar um determinado produto e necess�rio:

1) pegar a primeira fila para efetuar o pagamento
2) Com o pagamento realizado, voc� vai at� a fila 2 para retirar
3) Com o produto em m�os, voc� passa pela confer�ncia e finalmente recebe a nota fiscal
/*/
	
		public static void main(String[] args) {
			
			Queue<Integer> fila = new LinkedList<Integer>();
			
			//Adicionando a fila
			System.out.println("Aguardando na primeira fila para efetuar o pagamento");
			fila.add(1);
			
			if(fila.isEmpty()) { // Verificar se a Fila est� Vazia
				System.out.println("Sem fila!!");
				}else {
				System.out.println("Com fila!!");
				}

			System.out.println("O Tamanho da fila �: " + fila.size()); // Tamanho da Fila
			System.out.println("Pagamento efetuado com sucesso: "); 
			System.out.println("Removendo"); // Removendo
			if(fila.size() > 0) { // Tamanho da fila
			fila.remove(); //Remover Fila
			fila.poll(); // Remo��o Fila
			}
			System.out.println("O Tamanho da fila �: " + fila.size()); //Tamanho da Fila
			System.out.println("Fila dois para retirada de Nota Fiscal do Produto: "); 
			fila.add(2);
			if(fila.isEmpty()) {
				System.out.println("Se encontra sem fila!!");
				}else {
				System.out.println("Se encontra com fila!!!");
				}

			System.out.println("O Tamanho da fila �: " + fila.size()); //Tamanho da Fila
			System.out.println("Emitindo a Nota fiscal do Produto: "); //Tamanho da Fila
			System.out.println("Removendo");
			if(fila.size() > 0) {
			fila.remove(); //Remover
			fila.poll(); //Remo��o
			}
			System.out.println("O Tamanho da fila �: " + fila.size());

		}
}
