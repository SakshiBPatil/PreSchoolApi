package com.project.PreSchoolAPIs.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.PreSchoolAPIs.Model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Long>{

}
