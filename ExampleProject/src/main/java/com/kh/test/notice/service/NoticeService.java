package com.kh.test.notice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.test.notice.dao.NoticeDao;
import com.kh.test.notice.model.vo.Notice;

@Service
public class NoticeService {
	
	@Autowired NoticeDao noticeDao;

	public boolean putNotice(Notice notice) {

		if( noticeDao.insertNotice(notice)>0 ) {
			//영향을 준 행의 수가 1이상일때 true(삽입완료) 반환
			return true;
		}
		
		//아닌 경우에 false반환
		return false;
	}
	
}
