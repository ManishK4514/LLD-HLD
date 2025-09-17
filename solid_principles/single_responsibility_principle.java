// BAD - Violates SRP
public class Employee {
    public String getDesignation(int employeeID) {
        // Get employee designation
    }
    
    public void updateSalary(int employeeID) {
        // Update salary logic
    }
    
    public void sendEmail() {
        // Email sending logic - NOT related to Employee
    }
}

// ---------------------------------separator---------------------------------------------------------

// GOOD - Follows SRP
public class Employee {
    public String getDesignation(int employeeID) {
        // Get employee designation
    }
    
    public void updateSalary(int employeeID) {
        // Update salary logic
    }
}

public class NotificationService {
    public void sendEmail() {
        // Email sending logic
    }
}
