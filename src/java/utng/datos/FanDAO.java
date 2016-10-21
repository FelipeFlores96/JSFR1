/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Fan;

/**
 *
 * @author felip
 */
public class FanDAO extends DAO<Fan>{
       public FanDAO() {
        super(new Fan());
    }
    public Fan getOneById(Fan fan)
            throws HibernateException{
        return super.getOneById(fan.getIdFan());
    }
}
