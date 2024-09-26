package main;
import model.Inventario;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Principal {
	EntityManagerFactory factory;
	EntityManager em;
	Inventario pro;
	
	public void registrarRomero(Inventario data) throws Exception{
		try {
		factory = Persistence.createEntityManagerFactory("LPII_T1_Romero_Juan");
		em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(data);
		em.getTransaction().commit();
		em.close();
		factory.close();
		System.out.println("Inventario registrado correctamente");
		} catch (Exception e) {
			System.out.println("Inventario registrado incorrectamente");
		}
	}
	public static void main(String[] args) {
		Principal p = new Principal();
		try {
			//Registro
			Inventario inventario1 = new Inventario();
			inventario1.setNro_inv(0);
			inventario1.setFecha("25/09/24");
			inventario1.setIdproducto("4");
			inventario1.setCosto("10");
			p.registrarRomero(inventario1);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
