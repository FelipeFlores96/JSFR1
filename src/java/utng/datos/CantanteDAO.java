/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Cantante;

/**
 *
 * @author felip
 */
public class CantanteDAO extends DAO<Cantante>{

    public CantanteDAO() {
        super(new Cantante());
    }
        public Cantante getOneById(Cantante cantante)
            throws HibernateException{
        return super.getOneById(cantante.getIdCantante());
    }
    
}
