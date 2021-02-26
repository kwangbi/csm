package com.facroty.scm.domain.address.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BnZngmZip")	// 우편번호
public class BnZngmZip {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@ManyToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "BnZngmZip_id") 
	private BnZngmStNmLst bnzngmstnmlst;

	@Column(name = "zip")
	private String zip;

	@Column(name = "ser_num")
	private Long serNum;

	@Column(name = "ct_pvc_nm")
	private String ctPvcNm;

	@Column(name = "ct_gun_gu_nm")
	private String ctGnuGuNm;

	@Column(name = "up_myun_dong_nm")
	private String upMyunDongNm;

	@Column(name = "sta_main_house_num_ctt")
	private String staMainHousNumCtt;

	@Column(name = "sta_sub_house_num_ctt")
	private String staSubHousNumCtt;

	@Column(name = "end_main_house_num_ctt")
	private String endMainHousNumCtt;

	@Column(name = "end_sub_house_num_ctt")
	private String endSubHousNumCtt;

	@Column(name = "house_num_cl_cd")
	private String housNulClCd;

	@Column(name = "usable_yn")
	private Boolean usableYn;

	@Column(name = "autid_id")
	private String autidId;

	@Column(name = "audit_dtm")
	private Date auditDtm;

	@Column(name = "ct_pvc_addr_cd")
	private String ctPvcAddrCd;

	@Column(name = "ct_gun_gu_addr_cd")
	private String ctGunGuAddrCd;

	@Column(name = "kt_dong_cd_map_yn")
	private Boolean ktDongCdMapYn;
}
