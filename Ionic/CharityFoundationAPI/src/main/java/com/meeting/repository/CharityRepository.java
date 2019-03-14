package com.meeting.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meeting.model.Charity;

public interface CharityRepository extends JpaRepository<Charity, Integer>  {
//	@Transactional
//	@Query(value="SELECT * FROM budget_planner ORDER BY ID DESC LIMIT 1", nativeQuery=true) // gives the latest edit
//	BudgetPlanners findTheTop();

}
