package myprojects.exercicio36.dominio;

public enum MetodoPagamento {
    PIX{
        @Override
        public double aplicarTaxa(double valorBase) {
            return valorBase;
        }
    },
    BOLETO{
        @Override
        public double aplicarTaxa(double valorBase) {
            return valorBase + 3.50;
        }
    },
    CARTAO_CREDITO{
        @Override
        public double aplicarTaxa(double valorBase) {
            double taxa = valorBase * 0.10;
            return valorBase + taxa;
        }
    };

    public abstract double aplicarTaxa(double valorBase);
}
