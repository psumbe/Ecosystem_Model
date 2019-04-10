/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Hospital;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author prajakta
 */
public class OrganizationDirectoryHospital {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectoryHospital() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganizationHospital();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Inventory.getValue())){
            organization = new InventoryOrganizationHospital();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Reception.getValue())){
            organization = new ReceptionOrganizationHospital();
            organizationList.add(organization);
        }
        return organization;
    }
}