package br.com.agendaTelefonica;

public abstract class Contato {

    private String nome;
    private String telefone;
    private String dataNasc;

    private Agenda agenda;

    public Contato(String nome, String telefone, String dataNasc) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", DataNasc: " + dataNasc;
    }

}
