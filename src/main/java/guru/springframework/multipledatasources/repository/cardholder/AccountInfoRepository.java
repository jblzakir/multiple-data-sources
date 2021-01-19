package guru.springframework.multipledatasources.repository.cardholder;

import guru.springframework.multipledatasources.model.cardholder.AccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountInfoRepository extends JpaRepository<AccountInfo, String> {
}
