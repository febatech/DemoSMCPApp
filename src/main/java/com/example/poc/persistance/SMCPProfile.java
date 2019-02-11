package com.example.poc.persistance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SMCP_Profile", schema="POC_SMCP")
public class SMCPProfile {
	   	@Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    private Long id;
	   	
	   

		@Column(name="name")
	   	private String name;

	    @Column(name = "version")
	    private String version;

	    
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
	    
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	    
}
