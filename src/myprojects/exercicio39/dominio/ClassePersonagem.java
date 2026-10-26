package myprojects.exercicio39.dominio;

public enum ClassePersonagem {
    GUERREIRO{
        @Override
        public double calcularDanoFinal(double forcaFisica, double poderMagico) {
            return (poderMagico * 0.10) + forcaFisica;
        }
    },
    MAGO{
        @Override
        public double calcularDanoFinal(double forcaFisica, double poderMagico) {
            return (forcaFisica * 0.10) + poderMagico;
        }
    },
    ARQUEIRO{
        @Override
        public double calcularDanoFinal(double forcaFisica, double poderMagico) {
            return (forcaFisica * 0.60) + (poderMagico * 0.60);
        }
    };

    public abstract double calcularDanoFinal(double forcaFisica, double poderMagico);
}
