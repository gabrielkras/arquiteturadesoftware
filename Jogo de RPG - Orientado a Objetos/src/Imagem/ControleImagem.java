package Imagem;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import Tabuleiro.Elementos;

public abstract class ControleImagem {

	public static void definirImagem() throws Exception {
		Elementos.GRAMA.setIcon(new ImageIcon(ImageIO.read(ControleImagem.class
				.getResourceAsStream("/Imagens/grama.png"))));
	}

}
