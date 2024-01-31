package Model.Entity;

public class Movie extends Favs {
    private String gender;

    public Movie(String name, String ID, String gender) {
        super(name, ID);
        this.gender = gender;
    }

    public Movie(String gender) {
        super();
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
