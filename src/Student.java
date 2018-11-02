import java.util.Objects;

class Student {
    String firstName;
    String lastName;
    String studentID;

    public Student(String firstName, String lastName, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return firstName.equals(student.firstName) &&
                lastName.equals(student.lastName) &&
                studentID.equals(student.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, studentID);
    }

    @Override
    public String toString(){
        return firstName + " " + lastName + " (Grade book #" + studentID + ")";
    }
}