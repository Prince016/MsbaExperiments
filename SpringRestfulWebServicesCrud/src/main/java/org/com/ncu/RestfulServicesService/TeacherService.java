package org.com.ncu.RestfulServicesService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.com.ncu.RestfulServicesModel.Teacher;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class TeacherService {

 static HashMap<Integer,Teacher> teacherIdMap=getTeacherIdMap();

 // ------------> Prashant 19CSU219 <---------------
 

 public TeacherService() {
  super();

  if(teacherIdMap==null)
  {
   teacherIdMap=new HashMap<Integer,Teacher>();
  // Creating some objects of Country while initializing
   Teacher teacher1=new Teacher(1, "Prashant",10000);
   Teacher teacher2=new Teacher(4, "Teacher4",20000);
   Teacher teacher3=new Teacher(3, "Teacher3",80000);
   Teacher teacher4=new Teacher(2, "Teacher2",70000);


   teacherIdMap.put(1,teacher1);
   teacherIdMap.put(4,teacher2);
   teacherIdMap.put(3,teacher3);
   teacherIdMap.put(2,teacher4);
  }
 }

 public List<Teacher> getAllTeachers()
 {
  List<Teacher> teachers = new ArrayList<Teacher>(teacherIdMap.values());
  return teachers;
 }

 public Teacher getTeacher(int id)
 {
  Teacher teacher= teacherIdMap.get(id);
  return teacher;
 }
 public Teacher addTeacher(Teacher teacher)
 {
  teacher.setId(getMaxId()+1);
  teacherIdMap.put(teacher.getId(), teacher);
  return teacher;
 }
 
 public Teacher updateTeacher(Teacher teacher)
 {
  if(teacher.getId()<=0)
   return null;
  teacherIdMap.put(teacher.getId(), teacher);
  return teacher;

 }
 public void deleteTeacher(int id)
 {
  teacherIdMap.remove(id);
 }

 public static HashMap<Integer, Teacher> getTeacherIdMap() {
  return teacherIdMap;
 }
 

 // Utility method to get max id
 public static int getMaxId()
 {   int max=0;
 for (int id:teacherIdMap.keySet()) {  
  if(max<=id)
   max=id;

 }  
 return max;
 }
}

