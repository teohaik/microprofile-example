package com.airhacks.ping.boundary;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Student {

    public String name;
    public int age;
    public LocalDateTime timestamp;

    public List<Lesson> lessonList;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.timestamp = LocalDateTime.now();
        lessonList = new ArrayList<>();
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public Student addLesson(Lesson lesson){
        lessonList.add(lesson);
        return this;
    }
}
