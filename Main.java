package locadoradecarros;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    //CRUD PRINCIPAL
    public static int Crud() {

        Scanner scan = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Locadora de Carros\n");
            System.out.println("1 - Cliente");
            System.out.println("2 - Carro");
            System.out.println("3 - Locação");
            System.out.println("0 - Sair");
            opcao = scan.nextInt();

            if (opcao < 0 || opcao > 3) {
                System.out.println("Opção inválida\n");
            }
        } while (opcao < 0 || opcao > 3);

        return opcao;
    }

    //CRUD DO CLIENTE
    public static int CrudCliente() {

        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();
        String nome;
        String tel;
        String email;
        String cpf;
        String end;
        boolean existe;
        int opcao;

        do {
            System.out.println("Cliente\n");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            opcao = scan.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida\n");
            } else {
                switch (opcao) {
                    case 1://Cadastrar
                        System.out.println("Nome:");
                        nome = scan.next();

                        System.out.println("Telefone:");
                        tel = scan.next();

                        System.out.println("email:");
                        email = scan.next();

                        System.out.println("CPF:");
                        cpf = scan.next();

                        System.out.println("Endereço:");
                        end = scan.next();

                        cliente.Cadastrar(new Cliente(nome, tel, email, cpf, end));
                        //passando um cliente da lista para variavel c1
                        //Cliente c1 = Cliente.clientes.get(0);
                        break;
                    case 2://Consultar
                        System.out.println("Digite o CPF para consulta:\n");
                        cpf = scan.next();
                        clearBuffer(scan);
                        Cliente clienteaux = cliente.Consultar(cpf);

                        if (clienteaux == null) {
                            System.out.println("Cpf não cadastrado.");
                        } else {
                            System.out.println(clienteaux.getCpf());
                        }
                        break;

                    case 3:
                        System.out.println("Digite o CPF para alteracao:\n");
                        cpf = scan.next();
                        clearBuffer(scan);
                        Cliente clienteatt = cliente.Consultar(cpf);

                        if (clienteatt == null) {
                            System.out.println("Cpf não cadastrado.");
                        } else {
                            cliente.Atualizar(clienteatt);
                        }
                        break;
                    case 4:
                        System.out.println("Digite o CPF para consulta:\n");
                        cpf = scan.next();
                        clearBuffer(scan);
                        Cliente clienterem = cliente.Consultar(cpf);

                        if (clienterem == null) {
                            System.out.println("Cpf não cadastrado.\n");
                        } else {
                            cliente.Remover(clienterem);
                            System.out.println("Cliente removido.\n");
                        }
                        break;
                }
            }
        } while (opcao < 1 || opcao > 4);

        return opcao;
    }

    //CRUD DO CARRO
    public static int CrudCarro() {

        Scanner scan = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Carro\n");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            opcao = scan.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida\n");
            }
        } while (opcao < 1 || opcao > 4);

        return opcao;
    }

    //CRUD DA LOCAÇÃO
    public static int CrudLocacao() {

        Scanner scan = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Locação\n");
            System.out.println("1 - Retirada");
            System.out.println("2 - Devolução");
            System.out.println("3 - Consulta");
            opcao = scan.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida\n");
            }
        } while (opcao < 1 || opcao > 3);

        return opcao;
    }

    //MAIN
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opCrud, opcao;

        Carro c = new Carro();

        //RODA O CRUD ATÉ QUE A OPÇÃO SAIR SEJA SELECIONADA
        do {
            opCrud = Crud();

            switch (opCrud) {
                //CASO ESCOLHA O MENU DO CLIENTE
                case 1:
                    opcao = CrudCliente();
                    //DESENVOLVER AQUI AS FUNCIONALIDADES DO CRUDCLIENTE()
                    break;
                //CASO ESCOLHA O MENU DO CARRO
                case 2:
                    opcao = CrudCarro();
                    //DESENVOLVER AQUI AS FUNCIONALIDADES DO CRUDCARRO()
                    break;

                case 3:
                    opcao = CrudLocacao();
                    //DESENVOLVER AQUI AS FUNCIONALIDADES DO CRUDLOCACAO()
                    break;
            }
        } while (opCrud != 0);

    }

    private static void clearBuffer(Scanner scan) {
        if (scan.hasNextLine()) {
            scan.nextLine();
        }
    }
}
