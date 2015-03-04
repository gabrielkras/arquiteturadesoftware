package Tabuleiro;

import javax.swing.ImageIcon;

public enum Elementos {
	GRAMA, AGUA, MACA, PERSONAGEM;

	private ImageIcon icone;

	public Elementos() {
		setIcon(icone);
	}

	private void setIcon(ImageIcon icone) {
		this.icone = icone;
	}

	public ImageIcon getIcon() {
		return icone;
	}
}
