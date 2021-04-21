package locadoradecarros;

public class Locacao {
    
    private double valorLocacao;
    private double valorCalcao;
    private String horaLocacao;
    private String dataLocacao;
    private long kmAdquirida;
    private boolean devolvido;
    private String horaDevolucao;
    private String dataDevolucao;
    private long kmDevolvida;
    private String codigoLocacao;
    Cliente cli;
    Carro car;

    public Locacao(double valorLocacao, double valorCalcao, String horaLocacao, String dataLocacao, long kmAdquirida, boolean devolvido, String horaDevolucao, String dataDevolucao, long kmDevolvida, String codigoLocacao, Cliente cli, Carro car) {
        this.valorLocacao = valorLocacao;
        this.valorCalcao = valorCalcao;
        this.horaLocacao = horaLocacao;
        this.dataLocacao = dataLocacao;
        this.kmAdquirida = kmAdquirida;
        this.devolvido = devolvido;
        this.horaDevolucao = horaDevolucao;
        this.dataDevolucao = dataDevolucao;
        this.kmDevolvida = kmDevolvida;
        this.codigoLocacao = codigoLocacao;
        this.cli = cli;
        this.car = car;
    }

    public Locacao() {
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(float valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public String getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(String horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public float getKmAdquirida() {
        return kmAdquirida;
    }

    public void setKmAdquirida(long kmAdquirida) {
        this.kmAdquirida = kmAdquirida;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public String getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(String horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getKmDevolvida() {
        return kmDevolvida;
    }

    public void setKmDevolvida(long kmDevolvida) {
        this.kmDevolvida = kmDevolvida;
    }

    public String getCodigoLocacao() {
        return codigoLocacao;
    }

    public void setCodigoLocacao(String codigoLocacao) {
        this.codigoLocacao = codigoLocacao;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Carro getCar() {
        return car;
    }

    public void setCar(Carro car) {
        this.car = car;
    }
    
    
}
