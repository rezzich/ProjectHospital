public class Department {

    private Hospital hospital;
    private String name;
    private String head;
    private String doctors;
    public Department(String name, String head, String doctors) {
        this.name = name;
        this.head = head;
        this.doctors = doctors;
    }

    public String getDoctorName(){
        return name;
    }
    public String getHeadName(){
        return head;
    }
    public String getDoctorList(){
        return doctors;
    }

    public void setDoctorname(String name){
        this.name = name;
    }
    public void setHeadName(String head){
        this.head = head;
    }
    public void setDoctorList(String doctors){
        this.doctors = doctors;
    }

    void addDoctor(String doctor) {
        this.doctors.push(doctor);
    }

    class getDepartmentInfo() {
        console.log("Department: " + this.name);
        console.log("Head of Department: " + this.head);
        console.log("Doctors in Department: ");
        for(let doctor of this.doctors) {
            console.log(doctor);
        }
    }
}
