
package edu.ifpb.padroes.dao.factory;

import edu.ifpb.padroes.dao.interfaces.FactoryDaoIF;

/**
 *
 * @author lyndemberg
 */
public class Factory {
    public static FactoryDaoIF createFactory(){
        return new FactoryBD();
    }
}
