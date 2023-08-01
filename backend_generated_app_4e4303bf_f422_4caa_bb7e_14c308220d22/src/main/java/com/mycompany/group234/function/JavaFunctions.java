package com.mycompany.group234.function;

import com.mycompany.group234.model.Organization;
import com.mycompany.group234.model.EmployeePersonalInfo;
import com.mycompany.group234.model.EmlpoyeeProfile;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.mycompany.group234.repository.OrganizationRepository;
import com.mycompany.group234.repository.EmployeePersonalInfoRepository;
import com.mycompany.group234.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
