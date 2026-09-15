package academy.devdojo.maratonajava.introducao;

public class Teste {
    public static void main(String[] args) {
        class RegistroDeProdutos {
            String nomeDoProduto;
            int quantidadeDoProduto;

            RegistroDeProdutos(String nomeDoProduto, int quantidadeDoProduto) {
                this.nomeDoProduto = nomeDoProduto;
                this.quantidadeDoProduto = quantidadeDoProduto;
            }

            RegistroDeProdutos[] produtos = {
                    new RegistroDeProdutos("abacate", 45),
                    new RegistroDeProdutos("banana", 543),
                    new RegistroDeProdutos("morango", 445)
            };


        }


    }
}
