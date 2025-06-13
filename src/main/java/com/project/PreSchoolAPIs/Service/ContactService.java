package com.project.PreSchoolAPIs.Service;

import org.springframework.stereotype.Service;

import com.project.PreSchoolAPIs.Payload.ContactDTO;

@Service
public interface ContactService {

	void saveContact(ContactDTO contactDTO);
}
