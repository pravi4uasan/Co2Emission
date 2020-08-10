package com.emission.report.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="SENSORDETAILS")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(callSuper = false)
public class SensorDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="SENSOR_NAME")
	private String sensorName;
	
	@Column(name="SENSOR_LOCATION")
	private String sensorLocation;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="DISTRICTDETAILS_ID")
    private DistrictDetails districtDetails;
	
	
	  @OneToMany(mappedBy="sensorDetail", cascade= {CascadeType.PERSIST,
	  CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}) private
	  List<SensorReading> sensorReadingList;
	 
	
	/*
	 * @OneToMany(targetEntity = SensorReading.class, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "sensor_id", referencedColumnName = "id") private
	 * List<SensorReading> sensorDetailList;
	 */


}
