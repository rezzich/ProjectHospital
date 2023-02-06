public class Payment {
    private String doctor;
    private String department;
    private Float price;
    void constructor(String doctor, String department, Float price) {
        this.doctor = doctor;
        this.department = department;
        this.price = price;
    }

    public float calculateTotal() {
        return this.price;
    }

    public boolean processedPayment(Float amount) {
        if (amount < this.price) {
            console.log("Error: Payment amount is less than the total cost");
            return false;
        }else {
            console.log("Payment accepted. Thank you for your visit!");
            return true;
        }
    }
}