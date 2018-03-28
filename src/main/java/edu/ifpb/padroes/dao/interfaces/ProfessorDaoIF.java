/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.padroes.dao.interfaces;

import edu.ifpb.padroes.dao.model.Professor;

/**
 *
 * @author lyndemberg
 */
public interface ProfessorDaoIF {
    void criar(Professor novo);
    void ler(String matricula);
    void deletar(String matricula);
}
