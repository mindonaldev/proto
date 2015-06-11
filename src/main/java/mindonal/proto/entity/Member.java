package mindonal.proto.entity;

import lombok.Data;
import mindonal.proto.entity.converter.LocalDateTimePersistenceConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

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

    @Column(name = "create_datetime")
    @Convert(converter = LocalDateTimePersistenceConverter.class)
    private LocalDateTime update_dt = LocalDateTime.now();
}
