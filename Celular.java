public class TelefoneCelular {
    private String marca;
    private String modelo;
    private String cor;
    private int armazenamento;
    private double preco;

    // Construtor
    public TelefoneCelular(String marca, String modelo, String cor, int armazenamento, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.armazenamento = armazenamento;
        this.preco = preco;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        // Criando um objeto TelefoneCelular e atribuindo valores aos atributos
        TelefoneCelular celular = new TelefoneCelular("Samsung", "Galaxy S21", "Preto", 128, 3499.99);

        // Acessando os atributos utilizando os métodos getters
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Armazenamento: " + celular.getArmazenamento() + "GB");
        System.out.println("Preço: R$" + celular.getPreco());
    }
}
