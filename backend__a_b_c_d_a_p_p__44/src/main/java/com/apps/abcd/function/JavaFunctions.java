package com.apps.abcd.function;

import com.apps.abcd.model.Bus;
import com.apps.abcd.model.Route;
import com.apps.abcd.model.Driver;
import com.apps.abcd.model.Trip;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.abcd.repository.BusRepository;
import com.apps.abcd.repository.TripRepository;
import com.apps.abcd.repository.DriverRepository;
import com.apps.abcd.repository.RouteRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
