package Tabuleiro;

public class Mapa {
	private Elementos elementos[][];
	private int altura;
	private int largura;
	
	public Mapa(int altura, int largura){
		this.largura = largura;
		this.altura = altura;
	}
	
	public void definirMapa(Elementos elementos[][]){
		this.elementos = elementos;
	}
	
	public Elementos[][] getMapa(){
		return elementos;
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}

	
	
}
