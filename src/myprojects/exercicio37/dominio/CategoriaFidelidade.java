package myprojects.exercicio37.dominio;

public enum CategoriaFidelidade {
    BRONZE{
        @Override
        public double calcularValorFinal(double valorCompra) {
            return valorCompra;
        }
    },
    PRATA{
        @Override
        public double calcularValorFinal(double valorCompra) {
            double desconto = valorCompra * 0.05;
            return valorCompra - desconto;
        }
    },
    OURO{
        @Override
        public double calcularValorFinal(double valorCompra) {
            double desconto = valorCompra * 0.10;
            return valorCompra - desconto;
        }
    },
    DIAMANTE{
        @Override
        public double calcularValorFinal(double valorCompra) {
            double desconto = valorCompra * 0.20;
            return valorCompra - desconto;
        }
    };

    public abstract double calcularValorFinal(double valorCompra);
}
