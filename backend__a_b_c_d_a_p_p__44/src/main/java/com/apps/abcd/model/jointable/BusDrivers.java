package com.apps.abcd.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.abcd.model.Bus;
import com.apps.abcd.model.Route;
import com.apps.abcd.model.Driver;
import com.apps.abcd.model.Trip;

@Entity(name = "BusDrivers")
@Table(schema = "\"abcdv1\"", name = "\"BusDrivers\"")
@Data
public class BusDrivers{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"BusId\"")
	private Integer busId;

    
    @Column(name = "\"DriverId\"")
    private Integer driverId;
 
}