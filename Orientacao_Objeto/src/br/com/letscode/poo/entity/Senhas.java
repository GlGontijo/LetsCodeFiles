package br.com.letscode.poo.entity;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Senhas {
    private String senhaSHA2hex;

    private String setSenhaToHex(String senhaTexto) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte[] messageDigestSenhaSHA2 = algorithm.digest(senhaTexto.getBytes(StandardCharsets.UTF_8));

        StringBuilder hexStringSenhaSHA2 = new StringBuilder();
        for (byte b : messageDigestSenhaSHA2) {
            hexStringSenhaSHA2.append(String.format("%02X", 0xFF & b));
        }
        return hexStringSenhaSHA2.toString();
    }

    public void setSenhaSHA2hex(String senhaTexto) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        senhaSHA2hex = setSenhaToHex(senhaTexto);
    }

    public boolean isSenha(String senhaTexto) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return setSenhaToHex(senhaTexto).equals(this.senhaSHA2hex);
    }

}
