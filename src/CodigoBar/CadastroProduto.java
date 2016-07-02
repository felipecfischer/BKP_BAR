package CodigoBar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CadastroProduto {
    // ARRAY PARA CADASTRO DE PRODUTO //CRIA ARRAY // INSERE O TAMANHO DO ARRAY;

    static int arrayQtd;
    static Produto[] produto = new Produto[250];

    public static void cadProduto() {
        // VARIAVEIS
        String opcaoS = "";
        boolean opcaoB = true, opcaoBAux;

        System.out.println("------------Cadastro de produtos------------");

        do {
            //LA�O PARA CADASTRO DE PRODUTO	
            for (int i = 0; opcaoB == true; i++) {
                // LAÇO PARA VERIFICAR ONDE PAROU O CADASTRO
                for (int j = 0; j < produto.length; j++) {
                    if (produto[j] == null) {
                        i = j;
                        break;
                    }
                }

                produto[i] = new Produto(); // INICIALIZA A POSIÇÃO DO VETOR

                // INFORMAÇÕES DO PRODUTO
                System.out.print("--------------------------------------------");
                Bar.entrada.nextLine();// ESVAZIA SCANNER
                System.out.print("\nCategoria do produto: ");
                produto[i].categoria = Bar.entrada.nextLine();
                System.out.print("Nome do produto: ");
                produto[i].nome = Bar.entrada.nextLine();
                System.out.print("Marca: ");
                produto[i].marca = Bar.entrada.nextLine();
                System.out.print("Preço do Fabricante: R$ ");
                produto[i].precoFabricante = Bar.entrada.nextFloat();
                System.out.print("Preço de venda: R$ ");
                produto[i].precoUnitario = Bar.entrada.nextFloat();
                System.out.print("Quantidade disponivel: ");
                produto[i].quantidade = Bar.entrada.nextInt();
                // CADASTRAR DATA DE VALIDADE, VALIDA SE DIGITOU CORRETO				
                try {
                    Bar.entrada.nextLine();// ESVAZIA SCANNER
                    System.out.print("Validade: ");
                    String dataVal = Bar.entrada.nextLine();
                    DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
                    produto[i].validade = dataFormat.parse(dataVal);
                    System.out.println(produto[i].validade);
                } catch (Exception ex) {
                    System.out.println("Data Inválida!");
                }

                System.out.print("\n--------------------------------------------");
                System.out.print("\nProduto cadastrado com sucesso!");
                System.out.print("\n\n--------------------------------------------");

                System.out.println("\nDeseja cadastrar novo produto? (S / N)");
                // LAÇO PARA VERIFICAR A OPÇÕES E SE OPÇÕES FORAM DIGITAS CORRETAS 
                opcaoBAux = true;
                do {
                    opcaoS = Bar.entrada.next();
                    if ("s".equalsIgnoreCase(opcaoS)) {
                        opcaoBAux = false; // SAIR DO LAÇO
                    } else if ("n".equalsIgnoreCase(opcaoS)) {
                        System.out.print("\n--------------------------------------------\n");
                        System.out.println("Cadastro Finalizado!");
                        opcaoB = false; // SAIR DO MENU CADASTRO
                        opcaoBAux = false; // SAIR DO LAÇO
                    } else {
                        System.out.print("Opção inválida! Tente novamente: ");
                    }
                } while (opcaoBAux == true);
            }
        } while (opcaoB == true);
    }
}
