package myprojects.exercicio40.dominio;

public enum TipoPlantao {
    DIURNO_NORMAL{
        @Override
        public double calcularValorHora(double valorHoraBase) {
            return valorHoraBase;
        }
    },
    NOTURNO{
        @Override
        public double calcularValorHora(double valorHoraBase) {
            return valorHoraBase + (valorHoraBase * 0.20);
        }
    },
    FINAL_DE_SEMANA{
        @Override
        public double calcularValorHora(double valorHoraBase) {
            return valorHoraBase + (valorHoraBase * 0.50);
        }
    },
    FERIADO{
        @Override
        public double calcularValorHora(double  valorHoraBase) {
            return valorHoraBase * 2;
        }
    };

    public abstract double calcularValorHora(double valorHoraBase);
}
