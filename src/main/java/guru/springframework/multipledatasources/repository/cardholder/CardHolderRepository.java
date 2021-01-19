package guru.springframework.multipledatasources.repository.cardholder;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.multipledatasources.model.CardHolder;

public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}
