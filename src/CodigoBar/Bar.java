package CodigoBar;

import java.util.Scanner;
import InterfaceBar.*;

public class Bar {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws ClassNotFoundException {
        //VARIAVEIS DO MENU // CLASSE PRINCIPAL "MAIN"
        FrmLogin frmLogin = new FrmLogin();
        frmLogin.setVisible(true);
        
        boolean validarMenu = true;
        int opcaoI;

        do {
            // CHAMANDO MENU ESTOQUE EM OUTRA CLASSE    
            opcaoI = Menu.menu();

            // CASE PARA OPÇÕES DO MENU
            switch (opcaoI) {
                case 1:
                    Venda.venda(); // NOVA VENDA QUE ESTÁ EM OUTRA CLASSE
                    break;
                case 2:
                    CadastroProduto.cadProduto(); // CADASTRANDO PRODUTO // CLASSE CADASTROPRODUTO
                    break;
                case 3:
                    Estoque.estoque(); // LISTA ESTOQUE DE PRODUTOS CADASTRADOS // CLASSE ESTOQUE
                    break;
                case 4:
                    Caixa.caixa(); // CAIXA, MOVIMENTO // CLASSE CAIXA
                    break;
                default:
                    validarMenu = false; // SAIR
            }
        } while (validarMenu == true);
        System.out.println("Obrigado!"); // SAIR
    }
}
