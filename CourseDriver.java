import java.util.*;
import java.io.*;

public class CourseDriver{
    public static void main(String [] args){
      
      // Testing Course methods
      Course ethics = new Course( 
      "XCOR 3010",
      "Ethics at the End of Life",
      "Engagements with Knowledge and Practice",
      "Engaging the Mission",
      "" );

       Course revolutions = new Course(
      "XCOR 3010","Revolutions in Modern History",
      "Engagements with Knowledge and Practice"
      ,"Engaging Global Issues",
      "Cross-listed with HIST 3830");
      System.out.println( "The two course objects:\n\t" + revolutions+ "\n\t"+ethics );

      if(revolutions.equals(ethics)){
        System.out.println("\nCourse revolutions equals Course ethics.");
      }else{
        System.out.println("\nCourse revolutions and ethics are not equal."+"\n");
      }
     
      System.out.println("Course revolutions section is currently: "+revolutions.getSection());
      System.out.println("Course revolutions title is currently: "+revolutions.getTitle());
      System.out.println("Course revolutions stage is currently: "+revolutions.getStage());
      System.out.println("Course revolutions area is currently: "+revolutions.getArea());
      System.out.println("Course revolutions Notes are currently: "+revolutions.getNotes());
      System.out.println();

      revolutions.setSection("CPSC 2834");
      revolutions.setTitle("Data Structures");
      revolutions.setStage("Computer Science Principles");
      revolutions.setArea("Computer Science");
      revolutions.setNotes("Pre-Requisite course(s): CSPC 1724 Intro to Comp Sci II \n");
      System.out.println("Course revolutions is now modified to: \n\t"+revolutions);
      
      // Testing the Courses class methods
      Courses courses = new Courses();
      System.out.printf("There are %d courses before any courses are added\n",courses.size());
      System.out.println( courses.readCoursesFromFile( "Courses1.txt" ));

      System.out.println("\n Joshua \n");
      
      courses.add(ethics);
      System.out.printf("There are %d courses after addition of ethics\n", courses.size());

      courses.remove(ethics);
      int size = courses.size();
      System.out.println("\nThere are " + size + (size == 1? "course" : " courses") + " after removing the ethics course");

      String titletoremove = "Aristotle in New Orleans";
      courses.removeByTitle(titletoremove);
      System.out.println("\nThere are " + size + (size == 1? "course" : " courses") + " after removing "+titletoremove);

      System.out.println("\nThe courses after removing Ethics and Aristotle are: " + courses);

      List<Course> searched = courses.search(revolutions);
      System.out.println("\nNumber of course(s) that are equal to the revolutions course: "+ searched.size());

      Courses courses1 = new Courses();
      Course compsci = new Course("CSPC 1724", "Computer Science","Comp Sci Principles","Mathematics",
      "Precedes Data Structures");
      courses1.add(compsci);
      courses1.saveCoursesToFile("Courses.txt");
      // Joshua 4/12/2020 Dr. Edwards this works, but it saves to a dnew file not to

      // TODO 9 - Let's validate the input file.  (a) Remove any rows that have two few columns.  Return a list of the
      //  removed rows.  (b) Remove all but one copy of duplicate rows.  If any duplicates, keep one copy of the
      //  duplicated row but remove the duplicates.  (c) Given a list of the Core Areas, remove any
      //  rows that have an invalid Core Area.  (c) Given a list of the Stages, remove any rows that have an invalid Stage.
      //  Return a list of all removed rows.

      // TODO 10 - We need more data.  Add the first 10 XCOR 3020 courses to your input file.

      // TODO 12 - Let's make it easier to add more data to your input file.  Create
      //  boolean Courses.addToInputFile(Course).

      // TODO 13 - Given an ordered list of favorites, like [ethics, politics, technology, african] return an ordered list of
      //  favorite Courses by searching for ethics first, then politics, then technology, then african courses.
      // Use Collections.sort() https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
      // TODO 14 - Sort Courses by course.
      // TODO 15 - Sort Courses by title.
      // TODO 16 - Sort Courses by stage.
      // TODO 17 - Sort Courses by core area.
      // TODO 18 - Sort Courses by notes.

      // TODO 19 - Validate the input file by returning the indexes of any Course that has a typo.  How?  Compare the words
      //  to a dictionary.  Like maybe https://raw.githubusercontent.com/dwyl/english-words/master/words.txt
      //  What data structure should you use for the dictionary?

      // TODO 20 - I need a frequency count of the words in the input file to create a word cloud.
      //  What data structure should you use?

      // TODO 21 - I want to compare the words in the input file with the words in XULA's Mission.
      //  https://www.xula.edu/missionandvalues  What data structure should you use for this?

      // TODO 22 - Install Android Studio on your personal computer.  https://developer.android.com/studio/install
      //  You know enough Java that it's time for you to learn to write apps rather than console-based programming.

    }
}                             