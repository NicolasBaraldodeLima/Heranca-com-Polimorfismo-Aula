import java.util.Date;
import java.util.List;

public class Aluno extends Pessoa {

    private List<String>cursos;
    private double notas[];


    public double obterMedia() {
        int qtdNotas = this.notas.length;
        double totalNotas = 0;
        for (int i = 0; i < qtdNotas; i++) {
            totalNotas += this.notas[i];
        }

        return totalNotas/qtdNotas;
    }

    // Declaração de metodos getters e setters
}
