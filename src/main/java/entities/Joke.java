package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 *
 * @author Brandstrup
 */
@Entity
@Table(name = "jokes")
@NamedQuery(name = "Joke.deleteAllRows", query = "DELETE from Joke")
public class Joke implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url")
    private String url;
    
    @Column(name = "joke_body")
    private String jokeBody;

    //Todo: persistDate
    
    public Joke()
    {
    }

    public Joke(String url, String jokeBody)
    {
        this.url = url;
        this.jokeBody = jokeBody;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getJokeBody()
    {
        return jokeBody;
    }

    public void setJokeBody(String jokeBody)
    {
        this.jokeBody = jokeBody;
    }

    @Override
    public String toString()
    {
        return "Joke{" + "id=" + id + ", url=" + url + ", jokeBody=" + jokeBody + '}';
    }

}
