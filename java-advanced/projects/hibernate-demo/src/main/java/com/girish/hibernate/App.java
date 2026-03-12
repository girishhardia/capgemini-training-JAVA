package com.girish.hibernate;

import com.girish.hibernate.entities.Student;
import com.girish.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //student create
        //save : hibernate

        // create student obj
        Student student = new Student();

        student.setAbout("fsdfdsf");
        student.setActive(true);
        student.setCollage("lpu");
        student.setFathersname("ram");
        student.setName("Syam");
        student.setPhone("34546534");
        student.setStudentId(123456);



        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory);

        Session session = sessionFactory.openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.persist(student);
            transaction.commit();
            System.out.println("student saved succesfully");
        } catch (Exception e) {
            if (transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
