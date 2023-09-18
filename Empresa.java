package provap3;
class Empresa{
    private String nome;
    private String cnpj;
    private Trabalhador [] trabalhadores;
    private String endereco;
    private int numFuncionarios;
    private String  ceo;

    public Empresa(String nome, String cnpj, Trabalhador[] trabalhadores, String endereco, int numFuncionarios,
            String ceo, int numFuncionariosContratados) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.trabalhadores = new Trabalhador[20];
        this.endereco = endereco;
        this.numFuncionarios = 0;
        this.ceo = ceo;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public Trabalhador[] getTrabalhadores() {
        return trabalhadores;
    }

    public void setTrabalhadores(Trabalhador[] trabalhadores) {
        this.trabalhadores = trabalhadores;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCeo() {
        return ceo;
    }
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
    

    public void contratar(Trabalhador novTrabalhador){
        if(numFuncionarios < 20){
            trabalhadores [numFuncionarios] = novTrabalhador;
            numFuncionarios++;;
        }
    }

    public void trabalhar(){
        for(int i = 0; i < numFuncionarios; i++){
            if(!trabalhadores[i].isFerias()){
                trabalhadores[i].adicionarHoras(8);
            }
        }
    }

    public void calcularPagamento(){
        double totalPagamento = 0;
        for(int i = 0; i < numFuncionarios; i++){
            totalPagamento += trabalhadores[i].calcularSalario();
        }
        System.out.println("Valor total a ser pago: " + totalPagamento);
    }
    
    
}