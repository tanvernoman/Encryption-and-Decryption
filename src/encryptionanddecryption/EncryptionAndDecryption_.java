/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptionanddecryption;

/**
 *
 * @author afnan
 */
public class EncryptionAndDecryption_ {

    String testString;

    public EncryptionAndDecryption_() {
        testString = null;
    }

    public void printAsci(String testString) {
        for (int i = 0; i < testString.length(); i++) {
            System.out.println(testString.charAt(i)
                    + " "
                    + (int) testString.charAt(i));
        }
    }

    public String rot13(String clearText) {
        String encrypted = "";

        for (int i = 0; i < clearText.length(); i++) {
            char c = clearText.charAt(i);
            if (c >= 'a' && c <= 'm') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else {
                //System.out.println("this is not possible to encrypt");
            }
            encrypted = encrypted + c;
        }
        return encrypted;
    }

}
