package mindonal.proto.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mindonal.dev@gmail.com on 6/11/15.
 */
@Entity
@Data
public class Member {

    @Id
    private Long member_id;

    @Column(nullable = false)
    private String name;

    @Column
    private String desc;

//    @Column(name = "update_dt")
//    @Convert(converter = LocalDateConverter.class)
//    private LocalDateTime updateDt;
}
