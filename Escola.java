public class Escola {
    // class
    public static class Aluno {
        // Attributes
        private String Nome;
        private String Matricula;
        private String Curso;
        private int AnoDeIngresso;

        // Constructor default
        public Aluno() {

        }

        // Constructor with parameters
        public Aluno(String Nme, String Mat, String Cur, int ADI) {
            this.Nome = Nme;
            this.Matricula = Mat;
            this.Curso = Cur;
            this.AnoDeIngresso = ADI;
        }

        // Methods
        public String getNome() {
            return this.Nome;
        }

        public void setNome(String Nme) {
            this.Nome = Nme;
        }

        public String getMatricula() {
            return this.Matricula;
        }

        public void setMatricula(String Mat) {
            this.Matricula = Mat;
        }

        public String getCurso() {
            return this.Curso;
        }

        public void setCurso(String Cur) {
            this.Curso = Cur;
        }

        public int getAnoDeIngresso() {
            return this.AnoDeIngresso;
        }

        public void setAnoDeIngresso(int ADI) {
            this.AnoDeIngresso = ADI;
        }

        public int calcularTempoDeCurso(int anoAtual) {
            return anoAtual - this.AnoDeIngresso;
        }

        public void imprimirInfo() {
            System.out.println("Informacoes sobre o aluno: ");
            System.out.println("Nome do aluno: " + this.getNome());
            System.out.println("Matricula: " + this.getMatricula());
            System.out.println("Cursando: " + this.getCurso());
            System.out.println("Ano de ingresso: " + this.getAnoDeIngresso());
            System.out.println("O tempo de curso e de " + this.calcularTempoDeCurso(2024) + " anos");
        }

    }

    public static void main(String[] args) {
        Aluno student = new Aluno("Jose", "2932y3h", "Filosofia", 2003);
        student.imprimirInfo();
    }
}