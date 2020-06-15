import java.util.*;

public class Course {
    private String section;
    private String title;
    private String stage;
    private String area;
    private String notes;

    public Course(String Section, String Title, String Stage, String Area, String Notes) {
        section = Section;
        title = Title;
        stage = Stage;
        area = Area;
        notes = Notes;
    }

    //  This is ugly formatting. Codio doesn't know how to "beautify Java
    // code" but IntelliJ does.
    // Select menu choice Code | Reformat Code
    public String toString() {
        return (section + '|' + title + '|' + stage + '|' + area + '|' + notes);
    }

    public String getSection() {
        return section;
    }

    public String getTitle() {
        return title;
    }

    public String getStage() {
        return stage;
    }

    public String getArea() {
        return area;
    }

    public String getNotes() {
        return notes;
    }

    public void setSection(String inSec) {
        section = inSec;
    }

    public void setTitle(String inTtl) {
        title = inTtl;
    }

    public void setStage(String inStg) {
        stage = inStg;
    }

    public void setArea(String inAre) {
        area = inAre;
    }

    public void setNotes(String inNts) {
        notes = inNts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Course other = (Course) o;
        return this.section.equals(other.section) && this.title.equals(other.title) && this.stage.equals(other.stage)
                && this.area.equals(other.area) && this.notes.equals(other.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(section, title, stage, area, notes);
    }

}