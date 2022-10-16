package catrobots.springframework.catrobotsapp.domain;

import javax.persistence.*;

@Entity
public class CatBreed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String breed;

    public CatBreed(){
    }
    public CatBreed(String breed) {
        this.breed = breed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "CatBreed{" +
                "id=" + id +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CatBreed catBreed = (CatBreed) o;

        return id == catBreed.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
