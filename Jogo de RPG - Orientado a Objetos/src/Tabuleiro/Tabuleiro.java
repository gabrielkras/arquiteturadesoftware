package tabuleiro;


import java.awt.GridLayout;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon.*;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tabuleiro {

	private JFrame telaJogo;
	private Mapa mapa;
	private Elementos elementos[][];

	public Tabuleiro(Mapa mapa) {
		this.mapa = mapa;
		this.elementos = mapa.getMapa();
		telaJogo = new JFrame();

	}

	public void gerarTela() throws IOException {
		telaJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		telaJogo.setLayout(new GridLayout(mapa.getAltura(), mapa.getLargura()));

		// Adiciona as Imagens conforme o Cenario
		for (int k = 0; k < mapa.getAltura(); k++) {
			for (int j = 0; j < mapa.getLargura(); j++) {
				if (elementos[k][j] == Elementos.GRAMA) {
					telaJogo.add(new JLabel(new ImageIcon(ImageIO.read(Tabuleiro.class.getResourceAsStream(Elementos.GRAMA.getCaminhoImagem())))));
					// Adiciona a imagem de grama na tela do jogo
				} else if (elementos[k][j] == Elementos.AGUA) {
					telaJogo.add(new JLabel(new ImageIcon(ImageIO.read(Tabuleiro.class.getResourceAsStream(Elementos.AGUA.getCaminhoImagem())))));
					// Adiciona a imagem de agua na tela do jogo
				} else if (elementos[k][j] == Elementos.MACA) {
					telaJogo.add(new JLabel(new ImageIcon(ImageIO.read(Tabuleiro.class.getResourceAsStream(Elementos.MACA.getCaminhoImagem())))));
					// Adiciona a imagem de maca na tela do jogo
				} else if (elementos[k][j] == Elementos.PERSONAGEM) {
					telaJogo.add(new JLabel(new ImageIcon(ImageIO.read(Tabuleiro.class.getResourceAsStream(Elementos.PERSONAGEM.getCaminhoImagem())))));
					// Adiciona a imagem de personagem na tela do jogo
				}
			}
		}
		telaJogo.pack();
		telaJogo.setLocationRelativeTo(null);
		telaJogo.setVisible(true);
	}
	
	// Efetua a Troca da Imagem, Conforme a posição passada.
	public void alterarElemento(int altura, int largura, Elementos novoElemento) throws IOException{
		((JLabel) telaJogo.getContentPane().getComponent((altura * mapa.getLargura()) + largura )).setIcon(new ImageIcon(ImageIO.read
				(Tabuleiro.class.getResourceAsStream(novoElemento.getCaminhoImagem()))));
	}
}
