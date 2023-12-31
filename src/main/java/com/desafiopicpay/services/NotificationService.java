package com.desafiopicpay.services;

import com.desafiopicpay.domain.user.User;
import com.desafiopicpay.dtos.NotificationDto;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDto notificationRequest = new NotificationDto(email, message);

//       ResponseEntity<String> notificationResponse = restTemplate.postForEntity("http://o4d9z.mocklab.io/notify", notificationRequest, String.class);
//
//       if(!(notificationResponse.getStatusCode() == HttpStatus.OK)){
//           System.out.println("Error to envie notification");
//           throw new Exception("Notification Service it's unavailable");
//       }

        System.out.println("Notificação enviada para o usuario");
    }
}
