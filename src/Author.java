public class Author {
    private String name;
    private String email;
    private char gender;
    //-----Конструктор с параметрами name,email,gender
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    //-----геттер Name
    public String getName() {
        return name;
    }
    //-----геттер Email
    public String getEmail() {
        return email;
    }
    //-----сеттер Email
    public void setEmail(String email) {
        this.email = email;
    }
    //-----геттер Gender
    public char getGender() {
        return gender;
    }
    //-----метод toString
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
