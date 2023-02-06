public class Department {

    private Hospital hospital;
    private char name;
    private char head;
    private char doctors;
    public Department(char name, char head, char doctors) {
        this.name = name;
        this.head = head;
        this.doctors = doctors;
    }

    public char getDoctorName(){
        return name;
    }
    public char getHeadName(){
        return head;
    }
    public char getDoctorList(){
        return doctors;
    }

    void addDoctor(char doctor) {
        this.doctors.push(doctor);
    }

    class getDepartmentInfo() {
        console.log("Department: " + this.name);
        console.log("Head of Department: " + this.head);
        console.log("Doctors in Department: ");
        for (let doctor of this.doctors) {
            console.log(doctor);
        }
    }
}
