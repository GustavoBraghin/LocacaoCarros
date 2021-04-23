package locadoradecarros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String endereco;
    static List<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente(String nome, String telefone, String email, String cpf, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //MÉTODOS USADOS NO CRUD CLIENTE DA CLASSE CLIENTE
    public void Cadastrar(Cliente cliente) {
        Cliente.clientes.add(cliente);
    }

    public Cliente Consultar(String cpf) {
        int n = clientes.size();

        for (int i = 0; i < n; i++) {
            Cliente c = clientes.get(i);

            //COMPARA SE O CPF DO CLIENTE DA LISTA É IGUAL AO CPF DIGITADO PELO USUÁRIO  E RETORNA O CLIENTE SE TRUE
            if (cpf.equals(c.getCpf())) {
                System.out.print("Existente.");
                return c;
            }

        }
        return null;
    }

    public void Atualizar(Cliente cliente) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < Cliente.clientes.size(); i++) {
            if (cliente.equals(Cliente.clientes.get(i))) {

                System.out.println("Nome:");
                nome = scan.next();
                Cliente.clientes.get(i).setNome(nome);
                System.out.println("Telefone:");
                telefone = scan.next();
                Cliente.clientes.get(i).setTelefone(telefone);
                System.out.println("email:");
                email = scan.next();
                Cliente.clientes.get(i).setEmail(email);
                System.out.println("CPF:");
                cpf = scan.next();
                Cliente.clientes.get(i).setCpf(cpf);
                System.out.println("Endereço:");
                endereco = scan.next();
                Cliente.clientes.get(i).setEndereco(endereco);

                Cliente.clientes.set(i, cliente);
                System.out.println("Nome:" + Cliente.clientes.get(i).getNome());

                System.out.println("Tel:" + Cliente.clientes.get(i).getTelefone());

                System.out.println("Email:" + Cliente.clientes.get(i).getEmail());

                System.out.println("Cpf:" + Cliente.clientes.get(i).getCpf());

                System.out.println("end:" + Cliente.clientes.get(i).getEndereco());

            }
        }
    }

    public void Remover(Cliente cliente) {
        Cliente.clientes.remove(cliente);
    }

}
