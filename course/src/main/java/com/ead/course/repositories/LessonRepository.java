package com.ead.course.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ead.course.models.LessonModel;

public interface LessonRepository extends JpaRepository<LessonModel, UUID> {

    @Query(value = "select * from lessons where module_module_id = :moduleId", nativeQuery = true)
    List<LessonModel> findAllLessonIntoModule(@Param("moduleId") UUID moduleId);
}