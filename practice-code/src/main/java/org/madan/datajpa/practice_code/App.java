package org.madan.datajpa.practice_code;

import org.madan.datajpa.practice_code.config.AppConfig;

import org.madan.datajpa.practice_code.dao.StudentDao;
import org.madan.datajpa.practice_code.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student stu=new Student();
        stu.setName("Madan");
        stu.setAddress("Nepal");
        stu.setMobileNo("9066606141");
        
        AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao bean = container.getBean(StudentDao.class);
        bean.saveStudent(stu);
    }
}
