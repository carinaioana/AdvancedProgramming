package Lab4.compulsory;

import java.util.List;

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