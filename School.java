public class School {
    // Class
    public static class Aluno {
        // Attributes
        private String Nome;
        private int Idade;
        private String RegistroAluno;
        private String Curso;

        // Constructor
        public Aluno(String Name, int Age, String Ra, String Course) {
            this.Nome = Name;
            this.Idade = Age;
            this.RegistroAluno = Ra;
            this.Curso = Course;
        }

        // Methods
        public String getNome() {
            return this.Nome;
        }

        public void setNome(String Name) {
            this.Nome = Name;
        }

        public int getIdade() {
            return this.Idade;
        }

        public void setIdade(int Age) {
            this.Idade = Age;
        }

        public String getRegistroAluno() {
            return this.RegistroAluno;
        }

        public void setRegistroAluno(String Ra) {
            this.RegistroAluno = Ra;
        }

        public String getCurso() {
            return this.Curso;
        }

        public void setCurso(String Course) {
            this.Curso = Course;
        }

        public void menordeidade() {
            if (this.Idade < 18) {
                System.out.println("O aluno e menor de idade!");
            }
        }

        public void alterarCurso(String novoCurso) {
            this.Curso = novoCurso;
        }

        public void ExibirInformacoes() {
            System.out.println("Informacoes sobre o aluno:");
            System.out.println("Nome do aluno: " + this.getNome());
            System.out.println("Idade do aluno: " + this.getIdade() + " anos");
            System.out.println("Numero de registro: " + this.getRegistroAluno());
            System.out.println("Curso matriculado: " + this.getCurso());
            this.menordeidade();
        }
    }

    public static void main(String[] args) {
        Aluno Student = new Aluno("Roberto", 14, "198734", "Ciencias Atuarias");
        Student.alterarCurso("Engenharia mecanica");
        Student.ExibirInformacoes();
    }
}