package com.steigerwald.landon.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.steigerwald.landon.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}