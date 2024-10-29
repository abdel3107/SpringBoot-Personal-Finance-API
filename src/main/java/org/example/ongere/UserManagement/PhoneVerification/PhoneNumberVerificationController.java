package org.example.ongere.UserManagement.PhoneVerification;


import com.twilio.Twilio;
import com.twilio.rest.verify.v2.service.Verification;
import com.twilio.rest.verify.v2.service.VerificationCheck;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/auth/phone")
@Slf4j
public class PhoneNumberVerificationController {

    @Value("${TWILIO_ACCOUNT_SID}")
    String sid;

    @Value("${TWILIO_AUTH_TOKEN}")
    String authToken;

    @GetMapping(value = "/generateOTP")
    public ResponseEntity<String> generateOTP(
            @RequestParam String phoneNumber
    ){


        Twilio.init(sid, authToken);


        Verification verification = Verification.creator (
                        "VA0276acb344e81f69f32a811442cf8fd5", // this is your verification sid
                        "+"+phoneNumber, //this is your Twilio verified recipient phone number
                        "sms") // this is your channel type
                .create();

        System.out.println(verification.getStatus());

        log.info("OTP has been successfully generated, and awaits your verification {}", LocalDateTime.now());

        return new ResponseEntity<>("Your OTP has been sent to your verified phone number", HttpStatus.OK);
    }

    @GetMapping("/verifyOTP")
    public ResponseEntity<?> verifyUserOTP(
            @RequestParam String phoneNumber,
            @RequestParam String code
    ) {
        Twilio.init(sid, authToken);

        try {
            VerificationCheck verificationCheck = VerificationCheck.creator(
                            "VA0276acb344e81f69f32a811442cf8fd5")
                    .setTo("+"+phoneNumber)
                    .setCode(code)
                    .create();

            System.out.println(verificationCheck.getStatus());

            if (verificationCheck.getValid()) {
                return new ResponseEntity<>("This user's verification has been completed successfully", HttpStatus.OK);
            }

        } catch (Exception e) {
            return new ResponseEntity<>("Verification failed.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Verification failed.", HttpStatus.BAD_REQUEST);
    }
}
