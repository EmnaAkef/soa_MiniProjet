package com.emna.students.service;

import com.emna.students.dto.SectionDto;
import org.springframework.stereotype.Component;

@Component
public class DeptFallBack implements APIClient {
    @Override
    public SectionDto getSecByCode(String sectionCode) {
        return null;
    }
}
