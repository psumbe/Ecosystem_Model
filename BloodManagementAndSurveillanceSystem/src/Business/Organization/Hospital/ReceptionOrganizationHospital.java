/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Hospital;

import Business.Organization.Organization;
import Business.Role.InventoryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author prajakta
 */
public class ReceptionOrganizationHospital extends Organization{
    
    public ReceptionOrganizationHospital() {
        super(Organization.Type.Reception.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InventoryManagerRole());
        return roles;
    }
}
