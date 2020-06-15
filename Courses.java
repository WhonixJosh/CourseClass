import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.time.LocalDateTime;

public class Courses {
    private ArrayList<Course> courselist;

    public Courses() {
        courselist = new ArrayList<>();
    }

    public Courses(ArrayList<Course> clist) {
        // create a local copy of your parameter here
        clist = new ArrayList<>();
        // assign the copy rather than the parameter
        courselist = clist;
    }

    public int size() {
        return courselist.size();
    }

    public void add(Course x) {
        courselist.add(x);
    }

    public void remove(Course x) {
        courselist.remove(x);
    }

    public int removeByTitle(String coursetitle) {
        int hits = 0;

        // Good job. An Iterator is smart enough to traverse while removing.
        Iterator<Course> itr = courselist.iterator();
        while (itr.hasNext()) {
            Course current = itr.next();
            if (current.getTitle().equals(coursetitle)) {
                itr.remove();
                hits++;
            }
        }
        return hits;
    }

    public List<Course> search(Course targetcourse) {
        List<Course> results = new ArrayList<>();
        for (Course c : courselist) {
            if (c.equals(targetcourse)) {
                results.add(c);
            }
        }
        return results;
    }

    public String toString() {
        String str = "";
        for (Course c : courselist) {
            str += c.toString() + "\n";
        }
        return str;
    }

    public void saveCoursesToFile(String filename) {
        LocalDateTime now = LocalDateTime.now();
        try (PrintWriter pw = new PrintWriter(filename)) {
            pw.println(now);// print out current time/date between appendicies
            for (Course c : courselist) {
                pw.println(c.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Courses readCoursesFromFile(String filename) {
        Courses returncourses = new Courses();
        int count = 0;
        try (Scanner fileInput = new Scanner(new File(filename))) {
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String[] pieces = line.split("\\|");
                if (pieces.length == 5) {
                    Course x = new Course((pieces[0]), (pieces[1]), (pieces[2]), (pieces[3]), (pieces[4]));
                    count++;
                    returncourses.courselist.add(x);
                } else if (pieces.length == 1) {
                    System.out.println(pieces);
                } else {
                    System.out.println("\n\n*ERROR* wrong number of values: " + line);// TODO output line number to user
                }
            }
            System.out.println("\n" + count + " Total courses read from file.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return returncourses;
    }

}