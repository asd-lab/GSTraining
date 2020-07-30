import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  private String name;
  private int age;
  private int Id;
  
  public Solution(String name, int age, int Id){
    
    this.name = name;
    this.age = age;
    this.Id  = Id;  
    
  }
  
  public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


  
  public static List<Solution> getStudentList(){
    
    List<Solution> studentList = new ArrayList<>();
    
    studentList.add(new Solution("Jon", 22, 1001));
    studentList.add(new Solution("Steve", 19, 1003));
    studentList.add(new Solution("Kevin", 23, 1005));
    studentList.add(new Solution("Ron", 20, 1010));
    studentList.add(new Solution("Lucy", 18, 1111));
    
    return studentList;
  }
  
   public static List<String> sortByAge() {
   
     List<Solution> stlist = getStudentList();
      
      
    List<String> list = stlist.stream().sorted(Comparator.comparing(student -> student.getAge())).map(s->s.getName()).collect(Collectors.toList());
  
    return list;
  }
 
 
  
  public static void main(String[] args) {
  
     List<String> list = sortByAge();
    System.out.println(" Names in sorted order by age " + list);
  }
}
