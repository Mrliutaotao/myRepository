package web.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.learn.mapper.BillMapper;
import web.learn.model.BillVo;

@Service
public class BillService {
	
	@Autowired
	BillMapper billMapper;

	public BillVo getBillById(long billId) {
		return billMapper.getByPrimaryKey(billId);
	}
	
	

}
