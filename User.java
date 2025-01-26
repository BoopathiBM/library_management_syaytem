abstract class User {
     protected String userId;
     protected String name;
     protected String email;

     public User(String userId, String name, String email){
        this.userId = userId;
        this.name = name;
        this.email = email;
     }

    public String getuserId(){
        return userId;
    }
    public String getname(){
        return name;
    }
    public String getemail() {
        return email;
    }

    public abstract void displayDetails();

}
