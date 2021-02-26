package com.facroty.scm.domain.address.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BnZngmStNmLst")	// 도로명주소
public class BnZngmStNmLst {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private List<BnZngmZip> bnzngmzip;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bnzngmldong.ldong_cd",referencedColumnName = "ldong_cd")
	private BnZngmLdong bnzngmldong;

/*	
	@Column(name = "ldong_cd")
	private String ldongCd;
*/
	@Column(name = "st_nm_cd")
	private String stNmCd;

	@Column(name = "autid_id")
	private String autidId;

	@Column(name = "audit_dtm")
	private Date auditDtm;

	@Column(name = "st_nm")
	private String stNm;

	@Column(name = "eff_sta_dt")
	private Date effStaDt;

	@Column(name = "eff_end_dt")
	private Date effEndDt;

	@Column(name = "st_eng_nm")
	private String stEngNm;

	@Column(name = "up_myun_dong_ser_num")
	private String upMyunDongSerNum;

	@Column(name = "up_myun_dong_cl_cd")
	private String upMyunDongClCd;

	@Column(name = "sub_st_cd")
	private String subStCd;

	@Column(name = "sup_st_cd")
	private String supStCd;

	@Column(name = "st_nm_chg_rsn_cd")
	private String stNmChgRsnCd;

}
