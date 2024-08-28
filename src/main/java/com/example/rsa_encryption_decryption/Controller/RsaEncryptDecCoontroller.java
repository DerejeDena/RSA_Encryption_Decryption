package com.example.rsa_encryption_decryption.Controller;

import com.example.rsa_encryption_decryption.Service.RSAService;
import com.example.rsa_encryption_decryption.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.KeyPair;


@RestController
@RequestMapping("/rsa")
public class RsaEncryptDecCoontroller {

    @Autowired
    RSAService service;


    @GetMapping("/encryDecrMessage")
    public Response encryptedMessage(@RequestParam("message") String message){
        Response response = new Response();
        try {
            KeyPair keyPair = service.generateKeyPair();

            byte[] encryptedData = service.encrypt(message.getBytes(), keyPair.getPublic());
            byte[] decryptedData = service.decrypt(encryptedData, keyPair.getPrivate());

            response.setOrginalMsg(message);
            response.setEncryptMsg(new String(encryptedData));
            response.setDecryptedMsg(new String(decryptedData));


        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

}


