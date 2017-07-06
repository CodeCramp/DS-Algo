package com.codecramp.ds.hashmap;

public class HashMapDemo {

  public static void main(String[] args) {
    Student st1 = new Student("StudentOne", 1);
    Student st2 = new Student("StudentTwo", 2);
    Student st3 = new Student("StudentThree", 3);
    
    School sc1 = new School("SchoolOne", "CityOne");
    School sc2 = new School("SchoolTwo", "CityTwo");
    School sc3 = new School("SchoolThree", "CityThree");
    
    CustomHashMap<Student, School> studentToSchoolMap = new CustomHashMap<>();
    studentToSchoolMap.put(st1, sc1);
    studentToSchoolMap.put(st2, sc2);
    studentToSchoolMap.put(st3, sc3);
    studentToSchoolMap.printMap();
    studentToSchoolMap.put(st2, sc3);
    studentToSchoolMap.printMap();
    studentToSchoolMap.put(st2, sc2);
    studentToSchoolMap.printMap();
  }
}
