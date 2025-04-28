package com.coupon.aws;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class AppController {

    @GetMapping("health")
    public ResponseEntity<String> healthCheck() {
        try {
            String privateIp = InetAddress.getLocalHost().getHostAddress();
            return ResponseEntity.ok().body(privateIp + " / Success Health Check");
        } catch (UnknownHostException e) {
            return ResponseEntity.ok().body("Unknown Host");
        }
    }
}
