/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.NGO;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author prajakta
 */
public class OrganizationDirectoryNGO {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectoryNGO() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Reception.getValue())){
            organization = new ReceptionOrganizationNGO();
            organizationList.add(organization);
        }
        return organization;
    }
}