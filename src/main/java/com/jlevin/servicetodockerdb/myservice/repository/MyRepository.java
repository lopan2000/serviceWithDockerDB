package com.jlevin.servicetodockerdb.myservice.repository;

import com.jlevin.servicetodockerdb.myservice.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface MyRepository extends CrudRepository<User, Integer> {

}
