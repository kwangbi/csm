package com.facroty.scm.domain.address.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BnZngmRdong")	// 행정동
public class BnZngmRdong {
	@Id
	@Column(name = "rdong_cd", nullable = false)
	private String rDongCd;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "BnZngmZip_id")
	private List<BnZngmZip> bnzngmzip;	
	
	@Column(name = "autid_id")
	private String autidId;
	
	@Column(name = "audit_dtm")
	private Date auditDtm;
	
	@Column(name = "eff_sta_dt")
	private String effStaDt;
	
	@Column(name = "eff_end_dt")
	private String effEndDt;	
	
	@Column(name = "ct_pvc_nm")
	private String ctPvcNm;
	
	@Column(name = "ct_gnu_gu_nm")
	private String ctGnuGuNm;
	
	@Column(name = "up_myun_dong_nm")
	private String upMyunDongNm;	
}
