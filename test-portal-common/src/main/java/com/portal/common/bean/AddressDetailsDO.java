package com.portal.common.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_DTLS")
public class AddressDetailsDO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADDRESS_DTLS")
	@SequenceGenerator(name = "ADDRESS_DTLS", sequenceName = "ADDRESS_DTLS_SQ", allocationSize = 1)
	@Column(name = "ADDRESS_DTLS_ID")
	private Long addressDetlsId;

	@Column(name = "BUILDING_NO")
	private String buildingNo;

	@Column(name = "FLOOR_NO")
	private String floorNo;

	@Column(name = "STREET")
	private String street;

	@Column(name = "VILLAGE")
	private String village;

	@Column(name = "MONDAL")
	private String mandal;

	@Column(name = "DISTICT")
	private String distict;

	@Column(name = "PINCODE")
	private String pinCode;

}
