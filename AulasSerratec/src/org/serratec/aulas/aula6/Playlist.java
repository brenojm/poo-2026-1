package org.serratec.aulas.aula6;

public class Playlist {
	private String nomeDono;
	private Musica[] musicas;
	
	public Playlist(String nomeDono) {
		this.nomeDono = nomeDono;
		this.musicas = new Musica[5];
	}
	
	public void adicionarMusica(Musica musica) {
		for(int i = 0; i < musicas.length; i++) {
			if(musicas[i] == null)  {
				musicas[i] = musica;
				return;
			}
		}
	}
	
	public void tocarPlaylist() {
		System.out.println("Nome do Dono: " + nomeDono);
		for(int i = 0; i < musicas.length; i++) {
			if(musicas[i] != null) {
				System.out.println(musicas[i]);
			}
		}
	}
	
}
