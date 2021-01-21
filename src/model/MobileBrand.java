package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobileBrand {
	private String name;
	private List<Mobile> mobileList;
	public MobileBrand() {
		mobileList=new ArrayList<>();
	}
	public MobileBrand(String name, List<Mobile> mobileList) {
		super();
		this.name = name;
		if(mobileList!=null)
			this.mobileList = mobileList;
		else
			mobileList=new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Mobile> getMobileList() {
		return mobileList;
	}
	public void setMobileList(List<Mobile> mobileList) {
		this.mobileList = mobileList;
	}
	public void addMobileToMobileBrand(Mobile mobile)
	{
		this.mobileList.add(mobile);
	}
	public Boolean removeMobileFromMobileBrand(String referenceId)
	{
		//loop the mobileList and check if it is found and remove
		//ConcurrentModificationException		occurs when we loop a collection. and inside the loop we remove an element
//		for(Mobile mobile:mobileList)
//		{
//			if(mobile.getReferenceId().equals(referenceId))
//			{
//				//remove this
//				mobileList.remove(mobile);
//			}
//		}
		
		Iterator<Mobile> it = mobileList.iterator();
		while(it.hasNext())
		{
			Mobile current = it.next();
			if(current.getReferenceId().equals(referenceId))
			{
				//remove this mobile
				it.remove();
				return true;
			}
		}
		
		return false;
	}
	public void displayMobiles()
	{
		if(mobileList.size()==0)
		{
			System.out.println("No mobiles to show");
			return;
		}
		System.out.format("%-15s %-15s %-12s %-8s %s\n","Reference Id","Model Name","Display Size", "Price","Launched Date");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		for(Mobile mobile:mobileList)
		{
			System.out.format("%-15s %-15s %-12s %-8s %s\n",mobile.getReferenceId(),mobile.getModelName(),mobile.getDisplaySize(), mobile.getPrice(),sdf.format(mobile.getLaunchedDate()));
		}
	}

}
