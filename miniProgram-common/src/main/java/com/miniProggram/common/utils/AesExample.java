package com.miniProggram.common.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class AesExample {
    private static final String KEY = "0123456789abcdef"; // 密钥必须是长度为 16、24 或 32 的字节数组

    public static void main(String[] args) throws Exception {
        String plainText = "Hello, world!"; // 待加密的明文

        byte[] cipherText = aesEncrypt(plainText); // 加密
        System.out.println("Cipher text: " + new String(cipherText, StandardCharsets.UTF_8));

        String decryptedText = aesDecrypt(cipherText); // 解密
        System.out.println("Decrypted text: " + decryptedText);
    }

    public static byte[] aesEncrypt(String plainText) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        return cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
    }

    public static String aesDecrypt(byte[] cipherText) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] decryptedBytes = cipher.doFinal(cipherText);
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }
}
