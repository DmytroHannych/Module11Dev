package org.example.service;


import jakarta.transaction.Transactional;
import org.example.Entity.Ticket;
import org.example.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

public class TicketCrudService {

    public void create(Ticket ticket) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(ticket);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

//    @Transactional
    public Ticket getByid(Long id) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Ticket ticket = session.get(Ticket.class, id);
            return ticket;
        }
    }

    public List<Ticket> listAll() {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            List<Ticket> tickets = session.createQuery("from Ticket", Ticket.class).list();
            return tickets;
        }
    }


    public void deleteById(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Ticket ticket = session.get(Ticket.class, id);
            transaction = session.beginTransaction();
            if (ticket != null) {
                session.remove(ticket);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }


}
