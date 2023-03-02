package br.com.agendaTelefonica;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // INSTANCIANDO UM CONTATO COMERCIAL
        ContatoComercial leo = new ContatoComercial("Leo", "48 91223-3221", "26/07/2003", "SomaSC");
        ContatoComercial lucas = new ContatoComercial("Lucas", "48 94556-6554", "26/09/2002", "BK");

        // INSTANCIANDO UM CONTATO PESSOAL
        ContatoPessoal jean = new ContatoPessoal("Jean", "48 97889-9887", "21/11/1994");
        ContatoPessoal matheus = new ContatoPessoal("Matheus", "48 97845-5487", "20/07/2002");

        // INSTANCIANDO UMA AGENDA
        Agenda agenda = new Agenda("agendaDoLeo");

        // INSERINDO CONTATO NA AGENDA
        agenda.inserirContato(leo);
        agenda.inserirContato(lucas);
        agenda.inserirContato(jean);
        agenda.inserirContato(matheus);

        // BUSCANDO NOME NA AGENDA
        //Contato recuperar = agenda.buscarNome("Leo");
//
//        if (recuperar == null) {
//
//            System.out.println("Nome não encontrado");
//
//        } else {
//
//            System.out.println(recuperar);
//        }

        agenda.imprimirAgenda();

        System.out.println();

        // REMOVER CONTATO
        //agenda.removerContato(matheus);

        // ATUALIZAR NOME
        agenda.atualizarNome(leo, "Leonardo");

        // ATUALIZAR TELEFONE
        agenda.atualizarTelefone(jean, "48 99999-8888");

        // ATUALIZAR DATA DE NASCIMENTO
        agenda.atualizarDataNasc(matheus, "25/07/2002");
        
        // ATUALIZAR EMPRESA
        agenda.atualizarEmpresa(lucas, "SmartFit");

        agenda.imprimirAgenda();

        System.out.println();

        // BUSCANDO NOME NA AGENDA
        Contato recuperar = agenda.buscarNome("Mateus");

        if (recuperar == null) {

            System.out.println("Nome não encontrado");

        } else {

            System.out.println(recuperar);
        }

        //System.out.println(agenda.getNomeAgenda());
    }
}
