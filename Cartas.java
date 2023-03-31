package Deck;


public class Cartas<T> {
	private Object [] elementos;
	private int tamanho;
	
	public Cartas(){
		elementos = new Object[1];
		tamanho =0;
	}
	
	public void add(T elemento) {
		if(this.elementos.length ==  tamanho) {
			aumentarTamanho();
		}
		
		this.elementos[tamanho] = elemento;
		tamanho++;
	}
	
	public void removerTopo() {
		int indx = tamanho - 1;
		for(int i =0; i <tamanho;i++) {
			if(elementos != null) {
				elementos[indx] = null;
				tamanho--;
			}
		}
	
	}
	
	public void aumentarTamanho() {
		Object novoArray[] = new Object[tamanho * 2];
		for(int i =0;i< tamanho;i++) {
			novoArray[i] = elementos[i];
		}
		elementos = novoArray;
		
	}
	
	public int tamanho() {
		
		return tamanho;
	}
	
	public void exibir() {
		for(Object ob : elementos) {
			if(ob !=null){
				System.out.println(ob);
			}
		}
	}
	
}
