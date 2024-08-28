package com.example.rsa_encryption_decryption.util;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Response {

    private String orginalMsg;
    private String encryptMsg;
    private String decryptedMsg;
    private String privateKey;
    private byte [] encryptedData;
}
