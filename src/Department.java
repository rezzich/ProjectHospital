public class Department {
    public void construct(char name, char head, char doctors) {
        this.name = name;
        this.head = head;
        this.doctors = doctors;
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
