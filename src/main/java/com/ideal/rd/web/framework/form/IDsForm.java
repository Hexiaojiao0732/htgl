package com.ideal.rd.web.framework.form;

import java.util.ArrayList;
import java.util.List;

public class IDsForm implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String ids;

	@Override
	public String toString() {
		return "IDsForm [ids=" + ids + "]";
	}

	public List<Integer> getIntIDs() {
		List<Integer> list=new ArrayList<Integer>();
		List<String> ss= getStringIds();
		for(String id:ss)
		{
			list.add(Integer.parseInt(id));
		}
		return list;
	}

	public List<Long> getLongIDs() {
		List<Long> list=new ArrayList<Long>();
		List<String> ss= getStringIds();
		for(String id:ss)
		{
			list.add(Long.valueOf(id));
		}
		return list;
	}

	public List<Double> getDoubleIDs() {
		List<Double> list=new ArrayList<Double>();
		List<String> ss= getStringIds();
		for(String id:ss)
		{
			list.add(Double.parseDouble(id));
		}
		return list;
	}

	public List<Float> getFloatIDs() {
		List<Float> list=new ArrayList<Float>();
		List<String> ss= getStringIds();
		for(String id:ss)
		{
			list.add(Float.parseFloat(id));
		}
		return list;
	}

	public List<String> getStringIds() {
		List<String> list=new ArrayList<String>();
		if(ids!=null)
		{
			String ss[]=ids.split(",");
			for(String s:ss)
			{
				list.add(s);
			}
		}
		return list;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	
}
