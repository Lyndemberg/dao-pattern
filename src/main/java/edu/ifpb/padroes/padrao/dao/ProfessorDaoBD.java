/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.padroes.padrao.dao;

import edu.ifpb.padroes.dao.interfaces.ProfessorDaoIF;
import edu.ifpb.padroes.dao.model.Professor;

/**
 *
 * @author lyndemberg
 */
public class ProfessorDaoBD implements ProfessorDaoIF{

    @Override
    public void criar(Professor novo) {
        System.out.println("SALVOU O PROFESSOR NO BANCO");
    }

    @Override
    public void ler(String matricula) {
        System.out.println("RETORNA O PROFESSOR COM O BANCO");
    }

    @Override
    public void deletar(String matricula) {
        System.out.println("REMOVEU O PROFESSOR DO BANCO");
    }
    
}
