package com.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.model.Data;

@Repository
public interface ChallengeRepository extends JpaRepository<Data, Long> {

}