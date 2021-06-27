package com.devco.utils;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import static com.devco.utils.Constants.Security;
public class HashUtil {

    public static String decode(String encryptedString) throws IllegalBlockSizeException,
            BadPaddingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {
        Base64.Decoder decoder = Base64.getDecoder();
        Key aesKey = new SecretKeySpec(Security.FWK_FRASE_SEGURIDAD.getValue().getBytes(), Security.ALGORITHM.getValue());
        Cipher cipher = Cipher.getInstance(Security.ALGORITHM.getValue());
        cipher.init(Cipher.DECRYPT_MODE, aesKey);
        String decrypted = new String(cipher.doFinal(decoder.decode(encryptedString)));
        return decrypted;
    }
}
