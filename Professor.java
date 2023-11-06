import java.util.Date;
import java.util.List;

public class Professor extends Pessoa {

    private List<String>nomeCursoMinistrado;
    private double salario;

    public double obterSalario() {
        return this.salario;
    }

}
