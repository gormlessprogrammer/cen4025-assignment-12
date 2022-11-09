package tdList.Dao;

import java.util.List;
import tdlist.pojo.tdListDetails;

public interface tdListDao {

	public void saveTdListItem (tdListDetails tdListItem);
	public List<tdListDetails> showAllTdListItems();
	public void updateTdList (int id, String tdListItem);
	public void deleteTdList (tdListDetails tdListItem);
	
}
