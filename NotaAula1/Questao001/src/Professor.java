public class Professor extends Pessoa {


    private double salario;
    private int hora;
    private double salariohora;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getSalariohora() {
        return salariohora;
    }

    public void setSalariohora(double salariohora) {
        this.salariohora = salariohora;
    }


    public void calcularSalario() {
        salario = salariohora * hora;

    }
}
