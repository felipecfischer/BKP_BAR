package CodigoBar;

public class Menu {

    public static int menu() {
        //VARIAVEIS DO METODO
        int opcaoI;
        boolean validarMenu = false;
        
        System.out.println("--------------------------------------------");
        System.out.print("  Escolha uma opçãoo do menu a seguir \n");
        System.out.print("\n(1) - Venda");
        System.out.print("\n(2) - Cadastro Produto");
        System.out.print("\n(3) - Estoque");
        System.out.print("\n(4) - Caixa");
        System.out.print("\n(0) - Sair");
        System.out.print("\n--------------------------------------------");

        System.out.print("\nDigite a opção: ");
        do {
            opcaoI = Bar.entrada.nextInt();
            if (((opcaoI < 0) || (opcaoI > 5))) {
                System.out.print("\nOpção Inválida! digite novamente: ");
            } else {
                validarMenu = true;
            }
        } while (validarMenu == false);
        System.out.println("\n--------------------------------------------");
        return opcaoI;
    }
}
