package edu.ifpb.padroes.dao.main;

import edu.ifpb.padroes.dao.factory.Factory;
import edu.ifpb.padroes.dao.model.Professor;
import edu.ifpb.padroes.dao.interfaces.FactoryDaoIF;
import edu.ifpb.padroes.dao.interfaces.ProfessorDaoIF;
import edu.ifpb.padroes.dao.interfaces.UsuarioDaoIF;
import edu.ifpb.padroes.dao.model.Usuario;

/**
 *
 * @author lyndemberg
 */
public class Main {
    public static void main(String[] args) {
        FactoryDaoIF factory = Factory.createFactory();
        ProfessorDaoIF daoProfessor = factory.getDaoProfessor();
        UsuarioDaoIF daoUsuario = factory.getDaoUsuario();
        daoProfessor.criar(new Professor());
        daoUsuario.criar(new Usuario());
        
    }
}
