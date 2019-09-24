package com.zss.utils;
import java.util.List;

public class PageUtil<T>{

    private int pageSize=5;   			//页面大小
    private int totalCount;  				//记录总数
    private int totalPageCount; 			//总页数
    private int currPageNo = 1; 			//当前页码
    private List<T> page_listList=null;		//存放查询结果的集合

    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        if(totalCount%pageSize==0){
            totalPageCount = totalCount/pageSize;
        }else{
            totalPageCount = totalCount/pageSize+1;
        }

        this.totalCount = totalCount;
    }
    public int getTotalPageCount() {
        return totalPageCount;
    }
    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }
    public int getCurrPageNo() {
        return currPageNo;
    }
    public void setCurrPageNo(int currPageNo) {
        this.currPageNo = currPageNo;
    }
    public List<T> getPage_listList() {
        return page_listList;
    }
    public void setPage_listList(List<T> page_listList) {
        this.page_listList = page_listList;
    }
}
