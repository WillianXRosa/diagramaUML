import com.desfiodio.modeloumliphone.classes.Internet;
import com.desfiodio.modeloumliphone.classes.Musica;
import com.desfiodio.modeloumliphone.classes.Telefone;
import com.desfiodio.modeloumliphone.interfaces.Iphone;

public class Main {

	public static void main(String[] args) {
		
		Musica musica = new Iphone();
		Telefone telefone = new Iphone();
		Internet internet = new Iphone();
		
		musica.ouvirMusica();		
		internet.navegarNaInternet();
		telefone.realizarLigacao();
		
		

	}

}
