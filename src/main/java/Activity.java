import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Duration;
import java.time.Instant;

//Marks Activity as a JPA entity, meaning it maps to a database table named activity.
@Entity
public class Activity {
    // Declares id as the primary key for this entity
    @Id

    // Tells the database to auto-generate id values (using AUTO_INCREMENT in MySQL/PostgreSQL).
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Setting attributes
    private Long id;
    private double distance;
    private Instant startTime;
    private Instant endTime;
    private Long duration;
    private double pace;

    public double getDistance() {
        return distance;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime(){
        return endTime;
    }
}
