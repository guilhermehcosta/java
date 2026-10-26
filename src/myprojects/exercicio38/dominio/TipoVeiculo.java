package myprojects.exercicio38.dominio;

public enum TipoVeiculo {
    CARRO{
        @Override
        public double calcularTarifa(double tarifaBase) {
            double tarifa = tarifaBase * 1.0;
            return tarifa + tarifaBase;
        }
    },
    MOTO{
        @Override
        public double calcularTarifa(double tarifaBase) {
            double tarifa = tarifaBase * 0.5;
            return tarifa + tarifaBase;
        }
    },
    CAMINHAO{
        @Override
        public double calcularTarifa(double tarifaBase) {
            double tarifa = tarifaBase * 2.5;
            return tarifa + tarifaBase;
        }
    };

    public abstract double calcularTarifa(double tarifaBase);
}
