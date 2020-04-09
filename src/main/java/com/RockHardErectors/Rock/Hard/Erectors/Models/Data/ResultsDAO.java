package com.RockHardErectors.Rock.Hard.Erectors.Models.Data;

import com.RockHardErectors.Rock.Hard.Erectors.Models.Results;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ResultsDAO extends CrudRepository<Results, Integer>{}
