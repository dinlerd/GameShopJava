package Business.Abstract;

import Core.Entities.Concrete.User;
import Entities.Campaign;
import Entities.Game;

public interface SalesService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void sell(User user, Game game);
	void sell(User user, Game game, Campaign campaign);
}
