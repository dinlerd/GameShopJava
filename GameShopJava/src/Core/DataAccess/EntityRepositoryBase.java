package Core.DataAccess;

import java.util.List;

public class EntityRepositoryBase<TEntity> implements EntityRepository<TEntity>{

	@Override
	public void add(TEntity entity) {
		System.out.println("Added");
		
	}

	@Override
	public void update(TEntity entity) {
		System.out.println("Updated");		
	}

	@Override
	public void delete(TEntity entity) {
		System.out.println("Deleted");
		
	}

	@Override
	public List<TEntity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TEntity get() {
		// TODO Auto-generated method stub
		return null;
	}

}
