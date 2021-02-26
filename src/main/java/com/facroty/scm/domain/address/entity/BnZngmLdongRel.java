package com.facroty.scm.domain.address.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BnZngmLdongRel")
public class BnZngmLdongRel {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bnzngmldong.ldong_cd",referencedColumnName = "ldong_cd",nullable = false)
	private BnZngmLdong bnzngmldong;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bnzngmrdong.rdong_cd",referencedColumnName = "rdong_cd", nullable = false)
	private BnZngmRdong bnzngmrdong;
	
	@Column(name = "autid_id")
	private String autidId;
	
	@Column(name = "audit_dtm")
	private Date auditDtm;
	
	@Column(name = "eff_sta_dt")
	private String effStaDt;
	
	@Column(name = "eff_end_dt")
	private String effEndDt;	

}
