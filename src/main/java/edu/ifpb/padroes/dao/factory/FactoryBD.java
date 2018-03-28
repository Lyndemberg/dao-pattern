package edu.ifpb.padroes.dao.factory;

import edu.ifpb.padroes.dao.interfaces.ProfessorDaoIF;
import edu.ifpb.padroes.dao.interfaces.UsuarioDaoIF;
import edu.ifpb.padroes.padrao.dao.ProfessorDaoBD;
import edu.ifpb.padroes.padrao.dao.UsuarioDaoBD;
import edu.ifpb.padroes.dao.interfaces.FactoryDaoIF;

/**
 *
 * @author lyndemberg
 */
public class FactoryBD implements FactoryDaoIF{    
    
    public FactoryBD(){
    }
    
    @Override
    public ProfessorDaoIF getDaoProfessor() {
        return new ProfessorDaoBD();
    }

    @Override
    public UsuarioDaoIF getDaoUsuario() {
        return new UsuarioDaoBD();
    }
    
}
