package calculation;

public abstract sealed class CalculoIngresso permits Ingresso {

    protected double valorFilme;
    protected double nPessoas = 3;
    protected String nomeFilme, tipoFilme;

    public double getValorFilme() {
        return valorFilme;
    }

    public void setValorFilme(double valorFilme) {
        this.valorFilme = valorFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getTipoFilme() {
        return tipoFilme;
    }

    public void setTipoFilme(String tipoFilme) {
        this.tipoFilme = tipoFilme;
    }

    public double getValorMeia(){
        valorFilme = valorFilme / 2;
        return valorFilme;
    }

    public double getValorFamilia(){
        if (nPessoas >= 3) {
            valorFilme = nPessoas * (valorFilme * 0.95);
        }
        return valorFilme;
    }
}
