package tabuleiro;

import javax.swing.ImageIcon;

public enum Elementos {
	GRAMA("/grama.png"), AGUA("/agua.png"), MACA("/maca.png"), PERSONAGEM("/personagem.png");
	
	private String caminho;
	
	Elementos(String caminho){
		this.caminho = caminho;
	}

	public String getCaminhoImagem() {
		return caminho;
	}

}
