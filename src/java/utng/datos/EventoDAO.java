/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

//
import java.util.ArrayList;
import java.util.List;
//

import org.hibernate.HibernateException;
import utng.modelo.Evento;

/**
 *
 * @author felip
 */
public class EventoDAO extends DAO<Evento>{

    public EventoDAO() {
        super(new Evento());
    }
    public Evento getOneById(Evento evento)
            throws HibernateException {
        return super.getOneById(evento.getIdEvento());
    }
}
