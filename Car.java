public class Car {
    // Class
    public static class Carro {

        // Attributes
        private String Marca;
        private String Modelo;
        private int Ano;
        private String Color;
        private double velocidadeAtual;

        // Constructor
        public Carro(String Mrc, String Mdl, int Ano, String Cor) {
            this.Marca = Mrc;
            this.Modelo = Mdl;
            this.Ano = Ano;
            this.Color = Cor;
            this.velocidadeAtual = 0;
        }

        // Methods
        public String getMarca() {
            return this.Marca;
        }

        public void setMarca(String Mrc) {
            this.Marca = Mrc;
        }

        public String getModelo() {
            return this.Modelo;
        }

        public void setModelo(String Mdl) {
            this.Modelo = Mdl;
        }

        public int getAno() {
            return this.Ano;
        }

        public void setAno(int Ano) {
            this.Ano = Ano;
        }

        public String getColor() {
            return this.Color;
        }

        public void setColor(String Cor) {
            this.Color = Cor;
        }

        public void Acelerar(double valor) {
            this.velocidadeAtual += valor;
        }

        public void Frear(double valor) {
            if (this.velocidadeAtual > 0) {
                this.velocidadeAtual -= valor;
                if (this.velocidadeAtual < 0) {
                    this.velocidadeAtual = 0;
                }
            } else {
                System.out.println("Velocidade do carro nao pode ser negativa");
            }
        }

        public void ExibirInformacoes() {
            System.out.println("Informacoes do carro: ");
            System.out.println("Marca do carro: " + getMarca());
            System.out.println("Modelo do carro: " + getModelo());
            System.out.println("Ano do carro: " + getAno());
            System.out.println("Cor do carro: " + getColor());
            System.out.println("Velocidade do carro: " + this.velocidadeAtual + "km/h");
        }

    }

    public static void main(String[] args) {
        Carro Carruagem = new Carro("Lexus", "Es300h", 1998, "Verde esmeralda");
        Carruagem.Acelerar(200);
        Carruagem.Frear(120);
        Carruagem.ExibirInformacoes();
    }
}