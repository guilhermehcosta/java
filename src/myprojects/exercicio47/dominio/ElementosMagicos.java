package myprojects.exercicio47.dominio;

public enum ElementosMagicos {
    FOGO{
        @Override
        public int danoDeElementoMagico(int nivel) {
            return 10 * nivel;
        }
    },
    AGUA{
        @Override
        public int danoDeElementoMagico(int nivel) {
            return 5 * nivel;
        }
    },
    TERRA{
        @Override
        public int danoDeElementoMagico(int nivel) {
            return 7 * nivel;
        }
    },
    VENTO{
        @Override
        public int danoDeElementoMagico(int nivel) {
            return 4 * nivel;
        }
    };

    public abstract int danoDeElementoMagico(int nivel);
}
