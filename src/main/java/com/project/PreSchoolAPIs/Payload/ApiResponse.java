package com.project.PreSchoolAPIs.Payload;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {

	  @JsonProperty("STS")
	    private String STS ;
	    @JsonProperty("MSG")
	    private String MSG ;
	    @JsonProperty("CONTENT")
	    private T CONTENT ;
}
