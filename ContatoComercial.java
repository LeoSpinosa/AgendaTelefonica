package br.com.agendaTelefonica;

public class ContatoComercial extends Contato {

    private String empresa;

    public ContatoComercial(String nome, String telefone, String dataNasc, String empresa) {
        super(nome, telefone, dataNasc);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + ", Telefone: " + super.getTelefone() + ", DataNasc: " + super.getDataNasc() + ", Empresa: " + empresa;
    }

}
