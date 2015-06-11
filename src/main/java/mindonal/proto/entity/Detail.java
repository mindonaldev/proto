package mindonal.proto.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by mindonal.dev@gmail.com on 6/11/15.
 */
@Entity
@Data
public class Detail {

    @Id
    @GeneratedValue
    private Long detail_id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(foreignKey = @ForeignKey(name = "fk_detail_member"))
//    private Member member;

    @Column(nullable = false)
    private Long member_id;

    @Column(nullable = false)
    private String key;

    @Column
    private String value;
}
