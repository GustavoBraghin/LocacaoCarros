package locadoradecarros;

import java.util.Scanner;

public class Main {
    
    //CRUD PRINCIPAL
    public static int Crud(){
        
        Scanner scan = new Scanner(System.in);
        
        int opcao;
        
        do{
            System.out.println("Locadora de Carros\n");
            System.out.println("1 - Cliente");
            System.out.println("2 - Carrro");
            System.out.println("3 - Locação");
            System.out.println("0 - Sair");
            opcao = scan.nextInt();
            
            if(opcao < 0 || opcao > 3){
                System.out.println("Opção inválida\n");
            }
        }while (opcao <0 || opcao > 3);
        
        return opcao;
    }
    
    //CRUD DO CLIENTE
    public static int CrudCliente(){
        
        Scanner scan = new Scanner(System.in);
        
        int opcao;
        
        do{
            System.out.println("Cliente\n");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            opcao = scan.nextInt();
            
            if(opcao < 1 || opcao > 4){
                System.out.println("Opção inválida\n");
            }
        }while (opcao < 1 || opcao > 4);
        
        return opcao;
    }
    
    //CRUD DO CARRO
    public static int CrudCarro(){
        
        Scanner scan = new Scanner(System.in);
        
        int opcao;
        
        do{
            System.out.println("Carro\n");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            opcao = scan.nextInt();
            
            if(opcao < 1 || opcao > 4){
                System.out.println("Opção inválida\n");
            }
        }while (opcao < 1 || opcao > 4);
        
        return opcao;
    }
    
    //CRUD DA LOCAÇÃO
    public static int CrudLocacao(){
        
        Scanner scan = new Scanner(System.in);
        
        int opcao;
        
        do{
            System.out.println("Locação\n");
            System.out.println("1 - Retirada");
            System.out.println("2 - Devolução");
            System.out.println("3 - Consulta");
            opcao = scan.nextInt();
            
            if(opcao < 1 || opcao > 3){
                System.out.println("Opção inválida\n");
            }
        }while (opcao < 1 || opcao > 3);
        
        return opcao;
    }
    
    //MAIN
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int opCrud, opcao;
        
        Carro c = new Carro();
        
        //RODA O CRUD ATÉ QUE A OPÇÃO SAIR SEJA SELECIONADA
        do{
            opCrud = Crud();
            
            switch (opCrud){
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
        }while(opCrud != 0);
        
    }
    
}
