package org.serratec.aulas.revisao;

public class ExemploEscopo {
	// ─── VARIÁVEL DE CLASSE (static) ──────────────────────────────
	static int contadorClasse = 0; // compartilhada por todos os objetos

	// ─── VARIÁVEL DE INSTÂNCIA ────────────────────────────────────
	int valorInstancia = 10; // cada objeto tem a sua cópia

	void demonstrar() {

		// ─── VARIÁVEL LOCAL ───────────────────────────────────────
		int local = 42; // existe SOMENTE aqui
		System.out.println(local); // ✅ OK
		System.out.println(valorInstancia); // ✅ acessa instância
		System.out.println(contadorClasse); // ✅ acessa estática

		// ─── Escopo de bloco ──────────────────────────────────────
		if (true) {
			int blocoLocal = 99; // existe só dentro do if
			System.out.println(blocoLocal); // ✅ OK dentro do if
		}
		// System.out.println(blocoLocal); // ❌ ERRO: fora do escopo

		for (int i = 0; i < 3; i++) { // i existe só no for
			System.out.println(i);
		}
		// System.out.println(i); // ❌ ERRO: i não existe aqui

		// ─── Local DEVE ser inicializada ──────────────────────────
		int x;
		// System.out.println(x); // ❌ ERRO: x não inicializado
		x = 5;
		System.out.println(x); // ✅ agora pode usar
	}
}
