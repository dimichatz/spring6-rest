package gr.aueb.cf.schoolapp.service;

import gr.aueb.cf.schoolapp.core.exceptions.AppObjectAlreadyExists;
import gr.aueb.cf.schoolapp.core.exceptions.AppObjectInvalidArgumentException;
import gr.aueb.cf.schoolapp.dto.TeacherInsertDTO;
import gr.aueb.cf.schoolapp.dto.TeacherReadOnlyDTO;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ITeacherService {
    TeacherReadOnlyDTO saveTeacher(TeacherInsertDTO teacherInsertDTO, MultipartFile amkaFIle)
            throws AppObjectAlreadyExists, AppObjectInvalidArgumentException, IOException;
    public Page<TeacherReadOnlyDTO> getPaginatedTeachers(int page, int size);
    public Page<TeacherReadOnlyDTO> getPaginatedSortedTeachers(int page, int size, String sortBy, String sortDirection);
}
