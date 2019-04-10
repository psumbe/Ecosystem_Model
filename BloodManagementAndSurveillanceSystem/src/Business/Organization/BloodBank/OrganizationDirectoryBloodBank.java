/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.BloodBank;

import Business.Organization.Hospital.*;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author prajakta
 */
public class OrganizationDirectoryBloodBank {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectoryBloodBank() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganizationBloodBank();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Inventory.getValue())){
            organization = new InventoryOrganizationBloodBank();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Reception.getValue())){
            organization = new ReceptionOrganizationBloodBank();
            organizationList.add(organization);
        }
        return organization;
    }
}