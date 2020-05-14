package src.main.java.com.example.demo.model;

import java.time.LocalDate;

//@Entity
//@Table(name="films")
public class Film {

//  @Column(name="id", unique=true)
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name="title")
    private String title;

//    @Column(name="release_date")
    private LocalDate releaseDate;

//    @Column(name="description")
    private String description;

//    @Column(name="category")
    private FilmCategory category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FilmCategory getCategory() {
        return category;
    }

    public void setCategory(FilmCategory category) {
        this.category = category;
    }
}
