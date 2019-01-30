
public class UserClass {
    private int id;
    private String name, faculty, contact;
    UserClass(){}
    
    UserClass(int Id,String Name, String Faculty, String Contact){
        this.name    = Name;
        this.faculty = Faculty;
        this.contact = Contact;
        this.id      = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getContact() {
        return contact;
    }
    
}
