package org.serratec.exercicio10.teste;

import org.serratec.exercicio10.Passageiro;
import org.serratec.exercicio10.Voo;

public class TesteVoo {
    public static void main(String[] args) {
        Voo voo = new Voo(1024, "Latam");
        
        voo.fazerCheckIn(new Passageiro("Marcos", "111.222.333-44"));
        voo.fazerCheckIn(new Passageiro("Julia", "555.666.777-88"));
        
        voo.mostrarLotacao();
    }
}
