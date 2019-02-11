package com.example.poc.persistance;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SMCPProfileRepository extends CrudRepository<SMCPProfile,Long>  {

	public List<SMCPProfile> getByName(String name);
	public SMCPProfile getByNameAndVersion(String name, String version);
}
