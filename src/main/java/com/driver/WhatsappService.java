package com.driver;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WhatsappService {

    WhatsappRepository whatsappRepository=new WhatsappRepository();

    public String createUser(String name, String mobile) throws Exception {
          return whatsappRepository.createUser(name,mobile);
    }


    public Group createGroup(List<User> users){
        return whatsappRepository.createGroup(users);
    }


    public int createMessage(String content){
        return whatsappRepository.createMessage(content);
    }

   public int  sendMessage(Message message, User sender, Group group) throws Exception{
        return whatsappRepository.sendMessage(message,sender,group);
   }

    public String changeAdmin(User approver, User user, Group group) throws Exception{
        return whatsappRepository.changeAdmin(approver,user,group);
    }

    public int removeUser(User user) throws Exception{
        return whatsappRepository.removeUser(user);
    }

    public String findMessage(Date start, Date end, int K) throws Exception{
        //This is a bonus problem and does not contains any marks
        // Find the Kth latest message between start and end (excluding start and end)
        // If the number of messages between given time is less than K, throw "K is greater than the number of messages" exception

        return whatsappRepository.findMessage(start, end, K);
    }

}
