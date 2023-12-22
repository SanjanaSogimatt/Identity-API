/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.common.identity.data.rmnch;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.google.gson.annotations.Expose;

import lombok.Data;

@Entity
@Table(name = "i_beneficiaryaddress")
@Data
public class RMNCHMBeneficiaryaddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private BigInteger benAddressID;

	@Column(nullable = false, length = 50)
	private String createdBy;

	@Column(name = "CreatedDate", updatable = false)
	private Timestamp createdDate;

	@Column(length = 50)
	private String currAddrLine1;

	@Column(length = 50)
	private String currAddrLine2;

	@Column(length = 50)
	private String currAddrLine3;

	@Column(length = 15)
	private String currCountry;

	private Integer currCountryId;

	@Column(name = "currDistrict")
	private String districtname;

	@Column(name = "currDistrictId")
	private Integer districtid;

	@Column(length = 250)
	private String currAddressValue;

	private String currPinCode;

	@Column(length = 30)
	private String currState;

	@Column(name = "currStateId")
	private Integer stateid;

	@Column(length = 50)
	private String currSubDistrict;

	private Integer currSubDistrictId;

	@Column(name = "currVillage")
	private String villagename;

	private String currHabitation;

	@Column(name = "currVillageId")
	private Integer villageid;

	private Boolean deleted = false;

	@Column(length = 50)
	private String emerAddrLine1;

	@Column(length = 50)
	private String emerAddrLine2;

	@Column(length = 50)
	private String emerAddrLine3;

	@Column(length = 15)
	private String emerCountry;

	private Integer emerCountryId;

	@Column(length = 50)
	private String emerDistrict;

	private Integer emerDistrictId;

	@Column(length = 250)
	private String emerAddressValue;

	private String emerPinCode;

	@Column(length = 30)
	private String emerState;

	private Integer emerStateId;

	@Column(length = 50)
	private String emerSubDistrict;

	private Integer emerSubDistrictId;

	@Column(length = 100)
	private String emerVillage;

	private String emerHabitation;

	private Integer emerVillageId;

	private Timestamp lastModDate;

	@Column(length = 50)
	private String modifiedBy;

	@Column(length = 50)
	private String permAddrLine1;

	@Column(length = 50)
	private String permAddrLine2;

	@Column(length = 50)
	private String permAddrLine3;

	@Column(length = 250)
	private String permAddressValue;

	@Column(length = 15)
	private String permCountry;

	@Column(name = "PermCountryId")
	private Integer Countyid;

	@Column(length = 50, name = "PermDistrict")
	private String districtnamePerm;

	@Column(name = "PermDistrictId")
	private Integer districtidPerm;

	private String permPinCode;

	@Column(length = 30)
	private String permState;

	@Column(name = "PermStateId")
	private Integer statePerm;

	@Column(length = 50)
	private String permSubDistrict;

	private Integer permSubDistrictId;

	@Column(length = 100, name = "PermVillage")
	private String villagenamePerm;

	private String permHabitation;

	@Column(name = "PermVillageId")
	private Integer villageidPerm;

	@Column(name = "PermZoneID")
	private Integer permZoneID;

	@Column(name = "PermZone")
	private String permZone;

	@Column(name = "PermAreaId")
	private Integer permAreaId;

	@Column(name = "PermArea")
	private String permArea;

	@Column(name = "PermServicePointId")
	private Integer permServicePointId;

	@Column(name = "PermServicePoint")
	private String permServicePoint;

	@Column(name = "CurrZoneID")
	private Integer currZoneID;

	@Column(name = "CurrZone")
	private String currZone;

	@Column(name = "CurrAreaId")
	private Integer currAreaId;

	@Column(name = "CurrArea")
	private String currArea;

	@Column(name = "CurrServicePointId")
	private Integer currServicePointId;

	@Column(name = "CurrServicePoint")
	private String currServicePoint;

	@Column(name = "EmerZoneID")
	private Integer emerZoneID;

	@Column(name = "EmerZone")
	private String emerZone;

	@Column(name = "EmerAreaId")
	private Integer emerAreaId;

	@Column(name = "EmerArea")
	private String emerArea;

	@Column(name = "EmerServicePointId")
	private Integer emerServicePointId;

	@Column(name = "EmerServicePoint")
	private String emerServicePoint;

	@Column(nullable = false, length = 4)
	private String processed = "N";

	private Boolean reserved;

	private Integer reservedById;

	@Column(length = 45)
	private String reservedFor;

	private Timestamp reservedOn;

	@Expose
	@Column(name = "vanID", updatable = false)
	private Integer VanID;

	@Expose
	@Column(name = "parkingPlaceID", updatable = false)
	private Integer parkingPlaceID;

	@Expose
	@Column(name = "VanSerialNo", updatable = false)
	private BigInteger id;

	@Expose
	@Column(name = "SyncedBy")
	private String SyncedBy;

	@Expose
	@Column(name = "SyncedDate")
	private Timestamp SyncedDate;
}