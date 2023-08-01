package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.Organization;
import com.mycompany.group234.model.EmployeePersonalInfo;
import com.mycompany.group234.model.EmlpoyeeProfile;

@Entity(name = "OrganizationEmployees")
@Table(schema = "\"generated_app\"", name = "\"OrganizationEmployees\"")
@Data
public class OrganizationEmployees{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OrganizationID\"")
	private Integer organizationID;

    
    @Column(name = "\"EmpID\"")
    private Integer empID;
 
}