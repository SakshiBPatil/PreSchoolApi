package com.project.PreSchoolAPIs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.PreSchoolAPIs.Payload.ApiResponse;
import com.project.PreSchoolAPIs.Payload.ContactDTO;
import com.project.PreSchoolAPIs.Service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/contactUs")
	public ResponseEntity<ApiResponse<?>> contactUs(@RequestBody ContactDTO contactDTO){
		contactService.saveContact(contactDTO);
		return ResponseEntity.ok(new ApiResponse<>("200","Message Send Successfully",""));
	}

}
