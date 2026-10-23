package myprojects.exercicio32.dominio;

public enum TipoCliente {
    PESSOA_FISICA{
        @Override
        public double calcularImposto(double valorCompra) {
            double valorImposto = valorCompra * 0.05;
            return valorCompra + valorImposto;
        }
    },
    PESSOA_JURIDICA{
        @Override
        public double calcularImposto(double valorCompra) {
            double valorImposto = valorCompra * 0.15;
            return valorCompra + valorImposto;
        }
    };

    public abstract double calcularImposto(double valorCompra);
}
