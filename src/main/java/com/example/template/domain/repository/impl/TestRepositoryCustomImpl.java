package com.example.template.domain.repository.impl;

import com.example.template.domain.repository.TestRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestRepositoryCustomImpl implements TestRepositoryCustom {
    private final JPAQueryFactory query;
}
