package tdlist.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tdListItem")
public class tdListDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name="tdIndex")
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
int id;

@Column(name="tdItemName")
String tdListItem;

//int place;


public tdListDetails() {
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getTdListItem() {
	return tdListItem;
}
public void setTdListItem(String tdListItem) {
	this.tdListItem = tdListItem;
}

public void setId(String id2) {
	// TODO Auto-generated method stub
	
}

}
