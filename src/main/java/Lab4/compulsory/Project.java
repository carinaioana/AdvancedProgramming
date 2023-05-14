package Lab4.compulsory;

import java.util.List;

/**
 *  a class indicates that its instances can be compared to one another for the purpose of sorting
 */
public class Project implements Comparable<Project> {
    String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * ompares the current object (this) with another object of the same type.
     * @param o the object to be compared.
     * @returns an integer value that represents the result of the comparison
     */
    @Override
    public int compareTo(Project o) {
        return this.getProjectName().compareTo(o.getProjectName());
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                '}';
    }
}
