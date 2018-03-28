
package edu.ifpb.padroes.padrao.dao;

import edu.ifpb.padroes.dao.interfaces.UsuarioDaoIF;
import edu.ifpb.padroes.dao.model.Usuario;
import java.sql.Connection;

/**
 *
 * @author lyndemberg
 */
public class UsuarioDaoBD implements UsuarioDaoIF{
    private Connection conexao;
    
    @Override
    public void criar(Usuario u) {
        System.out.println("SALVOU O USUÁRIO NO BANCO");
    }

    @Override
    public void ler(String email) {
        System.out.println("LEU O USUÁRIO DO BANCO");
    }
    
}
