package com.capg.categorymanagement.dao;

public interface QueryMapper  
{
	public static final String LISTING_DETAILS_QUERY="SELECT * FROM categorymanagement";
	public static final String CREATE_CATEGORY_QUERY="INSERT INTO categorymanagement VALUES(category_id_seq.nextval,?)";
	public static final String CHECKING_THE_CATEGORY_QUERY="SELECT category_name FROM categorymanagement WHERE category_name=?";
	public static final String DISPLAYING_CATEGORY_ID_QUERY="SELECT category_id_seq.currval FROM DUAL";
	public static final String EDITING_CATEGORY_QUERY="UPDATE categorymanagement SET category_name=? WHERE category_name=?";
	public static final String DISPLAYING_ID="SELECT category_id FROM categorymanagement WHERE category_name=?";
	public static final String DELETING_CATEGORY_QUERY="DELETE  FROM categorymanagement WHERE category_name=?";
	public static final String CHECKING_ADMIN_EMAIL_QUERY="SELECT admin_email FROM admin_details WHERE admin_email=?";
	public static final String CHECKING_ADMIN_PASSWORD_QUERY="SELECT admin_password FROM admin_details WHERE admin_email=?";
}
