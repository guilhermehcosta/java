package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento{
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            double discount = valor * 0.1;
            return valor - discount;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            double discount = valor * 0.05;
            return valor - discount;
        }
    };

    public double calcularDesconto(double valor){
        return 0;
    }
}
