package myprojects.exercicio41.dominio;

public enum NivelHierarquico {
    ESTAGIARIO{
        @Override
        public double calcularPLR(double lucroEmpresa, double salarioBase) {
            return salarioBase;
        }
    },
    JUNIOR{
        @Override
        public double calcularPLR(double lucroEmpresa, double salarioBase) {
            return salarioBase * 1.5;
        }
    },
    PLENO{
        @Override
        public double calcularPLR(double lucroEmpresa, double salarioBase) {
            return salarioBase * 2;
        }
    },
    SENIOR{
        @Override
        public double calcularPLR(double lucroEmpresa, double salarioBase) {
            return salarioBase * 3;
        }
    },
    DIRETOR{
        @Override
        public double calcularPLR(double lucroEmpresa, double salarioBase) {
            return salarioBase * 4 + (0.001 * lucroEmpresa);
        }
    };

    public abstract double calcularPLR(double lucroEmpresa, double salarioBase);
}
