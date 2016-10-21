/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Concierto;

/**
 *
 * @author felip
 */
public class ConciertoDAO extends DAO<Concierto>{
    
    public ConciertoDAO() {
        super(new Concierto());
    }
    public Concierto getOneById(Concierto concierto)
            throws HibernateException{
        return super.getOneById(concierto.getIdConcierto());
    }
}
