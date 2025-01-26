class Librarian extends User {

    private String employeeId;
    

    public Librarian(String userId, String name, String email, String employeeId){
        super(userId, name, email);
        this.employeeId = employeeId;
    }

    public void displayDetails(){
        System.out.println("Librarian[UserID=" + userId + ", Name=" + name + ", Email=" + email + ", EmployeeID=" + employeeId + "]");

    }

    
}
