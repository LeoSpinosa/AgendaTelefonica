package br.com.agendaTelefonica;

import java.util.*;

public class Agenda {

    private String nomeAgenda;

    private List<Contato> contatos;

    public Agenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
        this.contatos = new ArrayList();
    }

    public Contato buscarNome(String nome) {

        try {
            for (Contato cttTeste : contatos) {
                if (cttTeste.getNome().equals(nome)) {

                    return cttTeste;
                }

            }
        } catch (Exception erro) {

            return null;
        }
        return null;

    }

    public List<Contato> imprimirAgenda() {

        for (Contato listaCotato : contatos) {

            System.out.println(listaCotato);
        }
        return null;
    }

    public void inserirContato(Contato ctt) {

        contatos.add(ctt);

    }

    public void removerContato(Contato ctt) {

        contatos.remove(ctt);
    }

    public void atualizarNome(Contato ctt, String nome) {

        if (ctt.getNome().equals(nome)) {

            System.out.println("Nome ja existe");

        } else {
            ctt.setNome(nome);
        }
    }

    public void atualizarTelefone(Contato ctt, String telefone) {

        if (ctt.getTelefone().equals(telefone)) {

            System.out.println("Telefone ja existe");

        } else {

            ctt.setTelefone(telefone);
        }

    }

    public void atualizarDataNasc(Contato ctt, String dataNasc) {

        if (ctt.getDataNasc().equals(dataNasc)) {

            System.out.println("Data de nascimento ja existe");

        } else {

            ctt.setDataNasc(dataNasc);
        }

    }

    public void atualizarEmpresa(ContatoComercial ctt, String empresa) {

        if (ctt.getEmpresa().equals(empresa)) {

            System.out.println("Empresa ja existe");

        } else {

            ctt.setEmpresa(empresa);

        }

    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "contatos=" + contatos + '}';
    }

}
