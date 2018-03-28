package edu.ifpb.padroes.dao.interfaces;

import edu.ifpb.padroes.dao.model.Usuario;

/**
 *
 * @author lyndemberg
 */
public interface UsuarioDaoIF {
    void criar(Usuario u);
    void ler(String email);
}
