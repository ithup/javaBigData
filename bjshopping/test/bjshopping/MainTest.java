package bjshopping;

import java.util.List;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.junit.Test;

import com.ithuplion.bjs.dao.CustomerDao;
import com.ithuplion.bjs.dao.ManagerDao;
import com.ithuplion.bjs.domain.Customer;
import com.ithuplion.bjs.domain.Manager;
import com.ithuplion.bjs.view.MainView;

public class MainTest {
	@Test
	public void run() throws Exception{
		new MainView().run();
	}
	@Test
	public void managerDao() throws Exception{
		ManagerDao managerDao=new ManagerDao();
		Manager manager = managerDao.login("admin", "123");
		if(manager!=null){
			System.out.println("µÇÂ¼³É¹¦");
		}else{
			System.out.println("µÇÂ¼Ê§°Ü");
		}
	}
	@Test
	public void customerTest() throws Exception{
		CustomerDao cd=new CustomerDao();
		List<Customer> allCustomers = cd.showAllCustomers();
		for (Customer customer : allCustomers) {
			System.out.println(customer.getCustNo()+"\t\t"+customer.getCustBirth()+"\t\t"+customer.getCustScore());
		}
	}
	@Test
	public void customerByCustNoTest() throws Exception{
		CustomerDao cd=new CustomerDao();
		int custNo=2017;
		Customer customer2 = cd.selectCustomerByCustNO(custNo);
		System.out.println(customer2.getCustNo()+"\t\t"+customer2.getCustBirth()+"\t\t"+customer2.getCustScore());
	}
}
