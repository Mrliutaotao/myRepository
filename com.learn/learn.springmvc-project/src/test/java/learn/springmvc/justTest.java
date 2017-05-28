package learn.springmvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import web.learn.service.BillService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring.xml", "classpath:/spring-mybatis.xml" })
public class justTest {

	@Autowired
	BillService billService;

	@Test
	public void getBill() {
		System.out.println(billService.getBillById(250445L));
	}

}
