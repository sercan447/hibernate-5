
package hibernate25.intherhance.pkg3;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class Hibernate25Intherhance3 {

  private static final SessionFactory concreteSessionFactory;
		static {
		 try {
		  concreteSessionFactory = new AnnotationConfiguration()
			.configure().buildSessionFactory();
		  } catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		  }
		}
		public static Session getSession()throws HibernateException {
			return concreteSessionFactory.openSession();
		}
    public static void main(String[] args) {
      Session ses = getSession();
      
      Sarki sarki = new Sarki(29,"show",47);
        ses.save(sarki);
        
      Husnu husnu = new Husnu(29,"show",42,"JG","LKL");  
      
        
        ses.flush();
        ses.clear();
        ses.save(husnu);
        
        ses.beginTransaction();
        ses.getTransaction().commit();
        
    }
    
}
