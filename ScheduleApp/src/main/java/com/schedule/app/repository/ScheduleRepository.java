package com.schedule.app;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface ScheduleRepository 
        extends JpaRepository<ScheduleData, Integer> {
 
}
