package provap3;
public class Trabalhador {
    private String nome;
    private int idade;
    private double valorHora;
    private int horasTrabalhadas;
    private boolean ferias;
    public Trabalhador(String nome, int idade, double valorHora, int horasTrabalhadas, boolean ferias) {
        this.nome = nome;
        this.idade = idade;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.ferias = ferias;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public boolean isFerias() {
        return ferias;
    }
    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }

    public boolean ferias(){
        return true;
    }
    public void adicionarHoras(int horas){
        if(!ferias){
            horasTrabalhadas += horas;
        }
    }
    public double calcularSalario(){
        return horasTrabalhadas * valorHora;
    }
}
