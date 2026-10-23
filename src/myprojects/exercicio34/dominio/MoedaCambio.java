package myprojects.exercicio34.dominio;

public enum MoedaCambio {
    DOLAR{
        @Override
        public double converterParaReal(double valorEstrangeiro) {
            return valorEstrangeiro * 5.05;
        }
    },
    EURO{
        @Override
        public double converterParaReal(double valorEstrangeiro) {
            return valorEstrangeiro * 5.65;
        }
    },
    LIBRA{
        @Override
        public double converterParaReal(double valorEstrangeiro) {
            return valorEstrangeiro * 6.75;
        }
    };

    public abstract double converterParaReal(double valorEstrangeiro);
}
