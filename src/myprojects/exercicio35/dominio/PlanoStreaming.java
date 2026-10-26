package myprojects.exercicio35.dominio;

public enum PlanoStreaming {
    BASICO{
        @Override
        public int calcularLimiteTelas() {
            return 1;
        }
        @Override
        public boolean oferece4k() {
            return false;
        }
    },
    PADRAO{
        @Override
        public int calcularLimiteTelas() {
            return 2;
        }

        @Override
        public boolean oferece4k() {
            return false;
        }
    },
    PREMIUM{
        @Override
        public int calcularLimiteTelas() {
            return 4;
        }

        @Override
        public boolean oferece4k() {
            return true;
        }
    };

    public abstract int calcularLimiteTelas();
    public abstract boolean oferece4k();
}
