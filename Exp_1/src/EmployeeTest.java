import org.ncu.dao.EmployeeDao;

public class EmployeeTest {

	public static void main(String args[]) {
		EmployeeDao empdao = new EmployeeDao();
//		empdao.create();		
//		empdao.update(101, "Prashant");
//		empdao.read();
		empdao.delete(101);
			
	}
}
