package com.emission.report.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="CITYDETAILS")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(callSuper = false)
public class CityDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="CITY_NAME")
	private String cityName;
	
	@Column(name="COUNTRY_NAME")
	private String countryName;
	
	@OneToOne(mappedBy="cityDetails", cascade=CascadeType.ALL)
	private CustomerDetails customerDetails;
	
	
	  @OneToMany(mappedBy="cityDetails", cascade= {CascadeType.PERSIST,
	  CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}) private
	  List<DistrictDetails> districtDetails;
	 
	
	/*
	 * @OneToMany(targetEntity = DistrictDetails.class, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "city_id", referencedColumnName = "id") private
	 * List<DistrictDetails> districtDetails;
	 */
	
	
}
