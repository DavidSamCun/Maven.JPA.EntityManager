package entities;


import javax.persistence.*;

@Entity
@Table(name ="cd")
public class Cd {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    private String title;
    private String description;
    private int year;
    private String artist;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
