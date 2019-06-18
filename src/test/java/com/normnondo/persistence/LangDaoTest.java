package com.normnondo.persistence;

import com.normnondo.RegisterDao;
import com.normnondo.entity.*;
import com.normnondo.SessionFactoryProvider;
import org.hibernate.Session;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LangDaoTest {

    RegisterDao registerDao;


    @BeforeEach
    void setUp() {
        registerDao = new RegisterDao(Lang.class);

        //Session session = getSession();
    }

    /*private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();

    }*/

    @Test
    void getAllStudentsSuccess() {
        List<Lang> students = (List<Lang>)registerDao.getAll();
        assertEquals(2, students.size());
    }

    @Test
    void getStudentByIdSuccess() {
        Lang students = (Lang)registerDao.getById(2);
        assertEquals("Ted", students.getFirstName());
    }

    @Test
    void insertSuccess() {
        Lang students = new Lang("Fred", "Flintstone", "fred.flintstone@gmail.com");
        int id = registerDao.insert(students);
        assertNotEquals(0,id);
        Lang insertedStudent = (Lang)registerDao.getById(id);
        assertEquals("Flintstone", insertedStudent.getLastName());
    }

}
