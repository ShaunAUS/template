package com.example.template.domain.repository;

import com.example.template.domain.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long>, TestRepositoryCustom{
}
