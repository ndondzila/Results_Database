package com.RockHardErectors.Rock.Hard.Erectors.Models.Data;

import com.RockHardErectors.Rock.Hard.Erectors.Models.Athlete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AthleteDAO extends CrudRepository<Athlete, Integer>{}
