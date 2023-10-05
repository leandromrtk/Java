import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "admin";
        String senhaCorreta = "admin";


        boolean loginBemSucedido = false;
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@\n#                         #\n#   FARMÁCIA GUADALAJARA  #\n#                         #\n@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println("Faça login para continuar\n");
        while (! loginBemSucedido) {
            System.out.println("Digite o usuário:");
            String usuario = s.nextLine();

            System.out.println("Digite sua senha:");
            String senha = s.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Usuário logado com sucesso!\n");
                loginBemSucedido = true;

            } else {
                System.out.println("Nome de usuário ou senha incorretos. Tente novamente!\n");
            }
        }

        int opcao = 0;
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@\n#                         #\n#   SISTEMA FARMACEUTICO  #\n#                         #\n@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

        while (opcao != 9)  {
            //System.out.println("\nCADASTRO DE MEDICAMENTO\n");

            System.out.println("Digite a sua opção:");
            System.out.println("1 - Cadastrar Medicamento");
            System.out.println("2 - Consultar Medicamento");
            System.out.println("3 - Alterar Cadastro");
            System.out.println("4 - Remover Cadastro");
            System.out.println("5 - Exibir todos os cadastros");
            System.out.println("9 - Sair do sistema");
            System.out.print("Sua opção: ");
            opcao = s.nextInt();

            switch (opcao)  {
                case 1: // cadastrar conta
                    System.out.println("Você escolheu cadastrar um Medicamento");

                    break;
                case 2: // consultar conta
                    System.out.println("Você escolheu consultar um Medicamento");
                    break;
                case 3: // alterar conta
                    System.out.println("Você escolheu alterar um Cadastro");
                    break;
                case 4: // remover conta
                    System.out.println("Você escolheu remover um Cadastro");
                    break;
                case 5: // exibe todas as contas
                    System.out.println("Você escolheu exibir todos os Cadastros");
                    break;
            }
            try {     Thread.sleep(4000);  }


            catch(Exception e)  {   e.printStackTrace(); }
        }
        // encerramento do programa...
        System.out.println("Saindo do sistema");
    }

}