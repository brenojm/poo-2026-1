package org.serratec.aulas.aula6.teste;

import org.serratec.aulas.aula6.Artista;
import org.serratec.aulas.aula6.Musica;
import org.serratec.aulas.aula6.Playlist;

public class TestePlaylist {

	public static void main(String[] args) {
		Artista a1 = new Artista("ColdPlay", "Britânico");
		Artista a2 = new Artista("Taylor Swift", "Estadunidense");
		
		Musica m1 = new Musica("A sky full of stars", 120, a1);
		Musica m2 = new Musica("Sparks", 137, a1);
		Musica m3 = new Musica("Shake it off", 143, a2);
		
		Playlist playlist = new Playlist("Breno");
		
		playlist.adicionarMusica(m1);
		playlist.adicionarMusica(m2);
		playlist.adicionarMusica(m3);
		
		playlist.tocarPlaylist();

	}

}
