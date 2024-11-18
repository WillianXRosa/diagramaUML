 package com.desfiodio.modeloumliphone.interfaces;

import com.desfiodio.modeloumliphone.classes.Internet;
import com.desfiodio.modeloumliphone.classes.Musica;
import com.desfiodio.modeloumliphone.classes.Telefone;

public class Iphone implements Musica, Internet, Telefone{

	@Override
	public void atenderLigacao() {
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void realizarLigacao() {
		System.out.println("Ralizando ligação");
		
	}

	@Override
	public void navegarNaInternet() {
		System.out.println("Navegando na internet");
		
	}

	@Override
	public void ouvirMusica() {
		System.out.println("Ouvindo música");
		
	}

}
