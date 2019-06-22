package pl.sda.bibliotekaonline;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by A.Wójcik on 16 06 2019.
 */
public class PasswordEncoder {

    @Test
    public void encodePassword() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encryptedPass = bCryptPasswordEncoder.encode("adm");
        System.out.println(encryptedPass);
    }
}
