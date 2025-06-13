package com.project.PreSchoolAPIs.Payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactDTO {

	private String name;
    private String email;
    private String subject;
    private String message;
}
