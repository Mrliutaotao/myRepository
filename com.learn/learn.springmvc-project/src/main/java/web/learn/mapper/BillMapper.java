package web.learn.mapper;

import org.springframework.stereotype.Service;

import web.learn.model.BillVo;

@Service
public interface BillMapper {
	BillVo getByPrimaryKey(Long billId);
}