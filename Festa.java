public abstract class FestaAniversario {
    private String nomeAniversariante;
    private int idadeAniversariante;
    private String local;
    private int numeroConvidados;
    private double orcamento;

    // Construtor
    public FestaAniversario(String nomeAniversariante, int idadeAniversariante, String local, int numeroConvidados, double orcamento) {
        this.nomeAniversariante = nomeAniversariante;
        this.idadeAniversariante = idadeAniversariante;
        this.local = local;
        this.numeroConvidados = numeroConvidados;
        this.orcamento = orcamento;
    }

    // Getters e Setters
    public String getNomeAniversariante() {
        return nomeAniversariante;
    }

    public void setNomeAniversariante(String nomeAniversariante) {
        this.nomeAniversariante = nomeAniversariante;
    }

    public int getIdadeAniversariante() {
        return idadeAniversariante;
    }

    public void setIdadeAniversariante(int idadeAniversariante) {
        this.idadeAniversariante = idadeAniversariante;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getNumeroConvidados() {
        return numeroConvidados;
    }

    public void setNumeroConvidados(int numeroConvidados) {
        this.numeroConvidados = numeroConvidados;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public abstract void realizarFesta();

    public static void main(String[] args) {
        // Criando um objeto FestaAniversario e atribuindo valores aos atributos
        FestaAniversario festa = new FestaAniversario("João", 30, "Salão de Festas", 50, 1500.00);

        // Acessando os atributos utilizando os métodos getters
        System.out.println("Nome do aniversariante: " + festa.getNomeAniversariante());
        System.out.println("Idade do aniversariante: " + festa.getIdadeAniversariante());
        System.out.println("Local da festa: " + festa.getLocal());
        System.out.println("Número de convidados: " + festa.getNumeroConvidados());
        System.out.println("Orçamento: R$" + festa.getOrcamento());

        // Chamando o método abstrato para realizar a festa
        festa.realizarFesta();
    }
}
