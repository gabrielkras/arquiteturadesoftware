package jogo;

import java.io.IOException;
import static tabuleiro.Elementos.*;
import java.util.Scanner;

import tabuleiro.*;


public class ExecucaoJogo {
	
	public static void main(String args[]) throws IOException{
		Elementos[][] e = {
				{GRAMA,GRAMA,GRAMA,GRAMA ,GRAMA},
				{AGUA ,AGUA ,AGUA ,PERSONAGEM,AGUA},
				{GRAMA,GRAMA,GRAMA,GRAMA ,GRAMA},
				{GRAMA,GRAMA,GRAMA,GRAMA ,GRAMA},
				{GRAMA,GRAMA,GRAMA,MACA,GRAMA},
		};
		
		Mapa fase1 = new Mapa(5,5);
		fase1.definirMapa(e);
		
		Tabuleiro tab = new Tabuleiro(fase1);
		tab.gerarTela();
		Scanner s = new Scanner(System.in);
		s.nextLine();
		tab.alterarElemento(3, 4, MACA);
	}

}
