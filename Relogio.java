public class Relogio {
    // Class
    public static class clock {
        // Attributes
        private int Horas;
        private int Minutos;

        // Constructor
        public clock(int Hour, int Minutes) {
            this.Horas = Hour;
            this.Minutos = Minutes;
        }

        // Methods
        public int getHoras() {
            return this.Horas;
        }

        public int getMinutos() {
            return this.Minutos;
        }

        public void setHora(int horas, int minutos) {
            this.Horas = horas;
            this.Minutos = minutos;
        }

        public void incrementaMinuto() {
            if (this.Minutos > 59) {
                this.Horas += this.Minutos / 60;
                this.Minutos %= 60;
            }
            if (this.Horas > 23) {
                this.Horas %= 24;
            }
        }

        public void mostraHora() {
            System.out.println("Que horas sao? " + String.format("%02d", this.getHoras()) + ":" + String.format("%02d", this.getMinutos()));
        }

    }

    public static void main(String[] args) {
        clock relogio = new clock(12, 87);
        relogio.incrementaMinuto();
        relogio.mostraHora();
    }
}