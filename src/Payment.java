public class Payment {
    void constructor(doctor, department, price) {
        this.doctor = doctor;
        this.department = department;
        this.price = price;
    }

    int calculateTotal() {
        return this.price;
    }

    boolean processPayment(amount) {
        if (amount < this.price) {
            console.log("Error: Payment amount is less than the total cost");
            return false;
        } else {
            console.log("Payment accepted. Thank you for your visit!");
            return true;
        }
    }
}