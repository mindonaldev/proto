package mindonal.proto.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created on 6/11/15.
 */
@Entity
@Data
public class Property {

    @Id
    @GeneratedValue
    private Long property_id;

    @Column(nullable = false)
    private String property;

    @Column
    private String desc1;

    @Column
    private String desc2;
}
