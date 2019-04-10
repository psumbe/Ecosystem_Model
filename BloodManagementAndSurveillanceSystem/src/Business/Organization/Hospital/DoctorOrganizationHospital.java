/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Hospital;

import Business.Organization.*;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author prajakta
 */
public class DoctorOrganizationHospital extends Organization{

    public DoctorOrganizationHospital() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
     
}