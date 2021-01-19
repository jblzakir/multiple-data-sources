package guru.springframework.multipledatasources.repository.card;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.multipledatasources.model.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
}
