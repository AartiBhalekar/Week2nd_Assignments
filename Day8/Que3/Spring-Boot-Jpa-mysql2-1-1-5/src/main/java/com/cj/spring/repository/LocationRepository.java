package com.cj.spring.repository;

import org.springframework.data.repository.CrudRepository;
import com.cj.spring.bean.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

}
