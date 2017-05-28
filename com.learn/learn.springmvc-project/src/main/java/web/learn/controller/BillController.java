package web.learn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import web.learn.model.BillVo;
import web.learn.service.BillService;

@Controller
@RequestMapping("/billController")
public class BillController {
	
	@Autowired
	private BillService billService;

	@RequestMapping("/showBill/{id}")
	public String showUser(@PathVariable String id, HttpServletRequest request) {
		BillVo billVo = billService.getBillById(Long.parseLong(id));
		request.setAttribute("billVo", billVo);
		return "showBill";
	}
}
 


