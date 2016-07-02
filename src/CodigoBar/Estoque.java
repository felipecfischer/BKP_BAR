package CodigoBar;

public class Estoque {

    public static void estoque() {
        System.out.println("-----------------Estoque--------------------");
        for (int i = 0; i < CadastroProduto.produto.length; i++) {
            if (CadastroProduto.produto[i] != null) {
                System.out.println("Categoria: " + CadastroProduto.produto[i].categoria);
                System.out.println("Marca: " + CadastroProduto.produto[i].marca);
                System.out.println("Nome: " + CadastroProduto.produto[i].nome);
                System.out.println("Preço do Fabricante: R$ " + CadastroProduto.produto[i].precoFabricante);
                System.out.println("Preço Unitário: R$ " + CadastroProduto.produto[i].precoUnitario);
                System.out.println("Quantidade: " + CadastroProduto.produto[i].quantidade);
                System.out.println("Validade: " + CadastroProduto.produto[i].validade);
                System.out.println("--------------------------------------------");
            } else if (CadastroProduto.produto[0] == null) {
                System.out.println("--------------------------------------------");
                System.out.println("    !NÃO POSSUI PRODUTOS CADASTRADOS!");
                break;
            }
        }
    }
}
