package mindonal.proto.repository;

import mindonal.proto.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by mindonal.dev@gmail.com on 6/11/15.
 */
@Repository
public interface DetailRepository extends JpaRepository<Detail, Long>, JpaSpecificationExecutor<Detail> {
}
