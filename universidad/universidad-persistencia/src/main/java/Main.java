import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persistence.createEntityManagerFactory("jpa_pu").createEntityManager();

	}
}
