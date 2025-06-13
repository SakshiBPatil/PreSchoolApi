package com.project.PreSchoolAPIs.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.project.PreSchoolAPIs.Model.Contact;
import com.project.PreSchoolAPIs.Payload.ContactDTO;
import com.project.PreSchoolAPIs.Repo.ContactRepo;
import com.project.PreSchoolAPIs.Service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepo contactRepo;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public void saveContact(ContactDTO contactDTO) {
		Contact contact=new Contact();
		contact.setName(contactDTO.getName());
		contact.setEmail(contactDTO.getEmail());
		contact.setSubject(contactDTO.getSubject());
		contact.setMessage(contactDTO.getMessage());
		contactRepo.save(contact);
		sendEmail(contactDTO);
		
	}
	
	 public void sendEmail(ContactDTO contactDTO) {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo("developer.quikhire@gmail.com","sahilbhandare80@gmail.com");
	        message.setSubject("New Contact Form Submission: " + contactDTO.getSubject());
	        message.setText("Name: " + contactDTO.getName() +
	                "\nEmail: " + contactDTO.getEmail() +
	                "\n\nMessage:\n" + contactDTO.getMessage());
	        mailSender.send(message);
	    }

}
