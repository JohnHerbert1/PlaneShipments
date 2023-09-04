package dao;

public interface FacedeCrud <t> {
	
	
	public Iterable<t> getList();
	
	public boolean save(Object object) throws Exception;
	
	public boolean update(Object object) throws Exception;
	
	public Object read(int hashID); 
	
	public boolean delete(int hashID);
		
	

}
