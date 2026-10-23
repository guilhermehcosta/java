package myprojects.exercicio33.dominio;

public enum RegiaoEnvio {
    NORTE{
        @Override
        public double calcularFrete(double pesoKg) {
            return pesoKg * 3;
        }
    },
    SUL{
        @Override
        public double calcularFrete(double pesoKg) {
            return pesoKg * 4;
        }
    },
    SUDESTE{
        @Override
        public double calcularFrete(double pesoKg) {
            return pesoKg * 5;
        }
    },
    CENTRO_OESTE{
        @Override
        public double calcularFrete(double pesoKg) {
            return pesoKg * 6;
        }
    };

    public abstract double calcularFrete(double pesoKg);
}
