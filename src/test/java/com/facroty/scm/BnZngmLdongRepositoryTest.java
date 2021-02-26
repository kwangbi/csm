package com.facroty.scm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.facroty.scm.domain.address.entity.BnZngmLdong;
import com.facroty.scm.domain.address.repository.BnZngmLdongRepository;

@SpringBootTest
class BnZngmLdongRepositoryTest {
	
	// 법정동 테스트

	@Autowired
	BnZngmLdongRepository bnZngmLdongRepository;
	
	BnZngmLdong bnZngmLdong;
	
	@Test
	void insertData() {
		Date now = new Date();
		
		bnZngmLdong = new BnZngmLdong();

		bnZngmLdong.setLDongCd("4136026521");
		bnZngmLdong.setAutidId("ZNGMBADD10101");
		bnZngmLdong.setAuditDtm(now);
		bnZngmLdong.setEffStaDt("20191021");
		bnZngmLdong.setEffEndDt("99991231");
		bnZngmLdong.setLDongClCd("4");
		bnZngmLdong.setCtPvcNm("경기");
		bnZngmLdong.setCtGnuGuNm("남양주시");
		bnZngmLdong.setUpMyunDongNm("퇴계원읍");
		bnZngmLdong.setRiNm("퇴계원리");
		bnZngmLdong.setSupLdongCd("4136026500");
		
		bnZngmLdongRepository.save(bnZngmLdong);
	}
}
