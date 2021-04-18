package locadoradecarros;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private String chassi;
    private String cor;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, String placa, String chassi, String cor, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    
}
