package edu.ifpb.padroes.dao.interfaces;

/**
 *
 * @author lyndemberg
 */
public interface FactoryDaoIF {
    ProfessorDaoIF getDaoProfessor();
    UsuarioDaoIF getDaoUsuario();
}
