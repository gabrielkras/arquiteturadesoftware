package Tabuleiro;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tabuleiro {

	private JFrame telaJogo;
	private Mapa mapa;
	private Elementos elementos[][];

	public Tabuleiro(Mapa mapa) {
		this.mapa = mapa;
		this.elementos = mapa.getMapa();

	}

	private void gerarTela() {
		telaJogo = new JFrame(); // Criar o frame

		telaJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		telaJogo.setLayout(new GridLayout(mapa.getAltura(), mapa.getLargura()));

		// Adiciona as Imagens conforme o Cenario
		for (int k = 0; k < mapa.getAltura(); k++) {
			for (int j = 0; j < mapa.getLargura(); j++) {
				if (elementos[k][j] == Elementos.GRAMA) {
					telaJogo.add(new JLabel(Elementos.GRAMA.getIcon()));
					// Adiciona a imagem de grama na tela do jogo
				} else if (elementos[k][j] == Elementos.AGUA) {
					telaJogo.add(new JLabel(Elementos.AGUA.getIcon()));
					// Adiciona a imagem de agua na tela do jogo
				} else if (elementos[k][j] == Elementos.MACA) {
					telaJogo.add(new JLabel(Elementos.MACA.getIcon()));
					// Adiciona a imagem de maca na tela do jogo
				} else if (elementos[k][j] == Elementos.PERSONAGEM) {
					telaJogo.add(new JLabel(Elementos.PERSONAGEM.getIcon()));
					// Adiciona a imagem de personagem na tela do jogo
				}
			}
		}
		telaJogo.pack();
		telaJogo.setLocationRelativeTo(null);
		telaJogo.setVisible(true);
	}
}
