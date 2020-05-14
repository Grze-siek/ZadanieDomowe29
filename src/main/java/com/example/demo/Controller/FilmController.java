package src.main.java.com.example.demo.Controller;

import src.main.java.com.example.demo.model.Film;

//@Controller
//@RequestMapping("/films")
public class FilmController {

//    private EntityManager entityManager;

//    @Autowired
//    @PersistenceUnit
//    private EntityManagerFactory factory;
//    @GetMapping("/addFilm")
//    @ResponseBody
//    @Transactional
String addFilm(Film film) {
//    factory = Persistence.createEntityManagerFactory("db");
//    entityManager = factory.createEntityManager();
//    entityManager.getTransaction().begin();
//    entityManager.persist(film);
//    entityManager.getTransaction().commit();
//    entityManager.close();
//    factory.close();
    return "redirect:/films";

//    @GetMapping("/film")
//    String details(@RequestParam Long id) {
//    factory = Persistence.createEntityManagerFactory("db");
//    entityManager = factory.createEntityManager();
//    entityManager.getTransaction().begin();

//        Film film1 = entityManager.find(Film.class, id)


            return "FilmSite";

        }
    }


}


}
