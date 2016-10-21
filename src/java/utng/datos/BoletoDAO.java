/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Boleto;

/**
 *
 * @author felip
 */
public class BoletoDAO extends DAO<Boleto> {

    public BoletoDAO() {
        super(new Boleto());
    }

    public Boleto getOneById(Boleto boleto)
            throws HibernateException {
        return super.getOneById(boleto.getIdBoleto());
    }
   
}
