/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagesapplication;

import ee.ttu.idu0075._2015.ws._package.AddMemberRequest;
import ee.ttu.idu0075._2015.ws._package.GetMemberRequest;
import ee.ttu.idu0075._2015.ws._package.MemberType;
import ee.ttu.idu0075._2015.ws._package.PackageService;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author kellisepp
 */
public class PackagesApplication {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PackageService ps = new PackageService();
        AddMemberRequest rq = new AddMemberRequest();
        rq.setToken("salajane");
        rq.setFirstName("Mihkel");
        rq.setLastName("Mets");
        rq.setRequestCode("1345");
        ps.getPackagePort().addMember(rq);
        
        
        
       Scanner obj = new Scanner(System.in);
       while(true){
       System.out.println("Enter member id: ");
       String id = obj.next();
       GetMemberRequest parameter = new GetMemberRequest();
       parameter.setToken("salajane");
       parameter.setId(new BigInteger(id));
       MemberType member = getMember(parameter);
       if(member == null){
           System.out.println("No member with given ID found");
       }else{
           System.out.println("Member:"+ member.getFirstName()+ " " + member.getLastName());
       }
       
       }         
    }

    private static MemberType getMember(ee.ttu.idu0075._2015.ws._package.GetMemberRequest parameter) {
        ee.ttu.idu0075._2015.ws._package.PackageService service = new ee.ttu.idu0075._2015.ws._package.PackageService();
        ee.ttu.idu0075._2015.ws._package.PackagePortType port = service.getPackagePort();
        return port.getMember(parameter);
    }
    
}
