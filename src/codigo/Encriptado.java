/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import static java.util.Objects.hash;

/**
 *
 * @author bea
 */
public class Encriptado {

    public static String encriptar( String contraseña ) {

        
        MessageDigest md;
        try {
            byte[] bytes = contraseña.getBytes();
            md = MessageDigest.getInstance("SHA-256");
            md.update(bytes);
            byte[] hash = md.digest();
            contraseña=valorHexadecimal(hash);

            
        } catch (NoSuchAlgorithmException e) {

        }

        return contraseña;
    }

    public static String valorHexadecimal(byte[] bytes) {
        String result = "";
        for (byte b : bytes) {
            result += String.format(String.format("%x", b));
        }
        return result;
    }

}
        