/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptionanddecryption;

import com.sun.corba.se.impl.oa.poa.Policies;
import javax.management.relation.Role;

/**
 *
 * @author afnan
 */
public class EncryptionAndDecryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EncryptionAndDecryption_ e= new EncryptionAndDecryption_();
        
        e.printAsci("this is a test string");
        
        String encrypt="this is a clear text";
        
        System.out.println(e.rot13(encrypt));
        System.out.println(e.rot13(e.rot13(encrypt)));
    }
    
}
