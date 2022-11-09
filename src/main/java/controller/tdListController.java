package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tdList.Dao.tdListDao;
import tdList.DaoInt.TdListDaoIntegration;
import tdlist.pojo.tdListDetails;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



 
public class tdListController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	tdListDetails tdListItem = new tdListDetails();
	TdListDaoIntegration tdListIntegration = new TdListDaoIntegration();
	tdListDao tdDao;
	
	 @Override
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		 if(request.getParameter("addTdItem")!=null){
			 String tdItem = request.getParameter("tdItem");
			 String id = request.getParameter("id");
			 tdListItem.setTdListItem(tdItem);
			 tdListItem.setId(id);
			 tdListIntegration.saveTdListItem(tdListItem);
			 RequestDispatcher rd = request.getRequestDispatcher("ItemAdd.jsp");
			 rd.forward(request, response);
		 	}
		 }
		 
	@Override
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	         if(request.getParameter("showTdList")!=null){
	        	 List<tdListDetails> tdList = new ArrayList<tdListDetails>();
	        	 tdList = tdListIntegration.showAllTdListItems();
	        	 request.setAttribute("tdList", tdList);
	        	 RequestDispatcher rd = request.getRequestDispatcher("ShowAll.jsp");
	        	 rd.forward(request, response);
	        }
	         
	        if(request.getParameter("updateTdList")!=null) {
	        	int id1 = Integer.parseInt(request.getParameter("id"));
	        	String tdItem = request.getParameter("tdItem");
	        	tdListIntegration.updateTdList(id1, tdItem);
	        	RequestDispatcher rd = request.getRequestDispatcher("UpdateTdList.jsp");
	        	rd.forward(request, response);
	        }
	        
	        if(request.getParameter("deleteTdItem")!=null) {
	        	int id2 = Integer.parseInt(request.getParameter("id"));
	        	tdListItem.setId(id2);
	        	tdListIntegration.deleteTdList(tdListItem);
	        	RequestDispatcher rd = request.getRequestDispatcher("ItemAdd.jsp");
	        	rd.forward(request, response);
	        }
	            }
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}
}
