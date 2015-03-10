package jogo;

import java.io.IOException;

import tabuleiro.*;


public class ExecucaoJogo {
	
	public static void main(String args[]) throws IOException{
		Elementos[][] e = {
				{Elementos.GRAMA,Elementos.GRAMA,Elementos.GRAMA,Elementos.GRAMA,Elementos.GRAMA},
				{Elementos.AGUA,Elementos.AGUA,Elementos.AGUA,Elementos.PERSONAGEM,Elementos.AGUA},
				{Elementos.GRAMA,Elementos.GRAMA,Elementos.GRAMA,Elementos.GRAMA,Elementos.GRAMA},
				{Elementos.GRAMA,Elementos.GRAMA,Elementos.GRAMA,Elementos.GRAMA,Elementos.GRAMA},
				{Elementos.GRAMA,Elementos.GRAMA,Elementos.GRAMA,Elementos.MACA,Elementos.GRAMA},
		};
		
		Mapa fase1 = new Mapa(5,5);
		fase1.definirMapa(e);
		
		Tabuleiro tab = new Tabuleiro(fase1);
		tab.gerarTela();
	}

}
