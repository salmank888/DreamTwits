package com.devicebee.modals;

public class TweetModal {
	
	private String userName = "";
	private String userPhoto = "";
	private String tweatString = "";
	private String tweatPhoto = "";
	private String tweatTime = "";
	private String tweatLikesCount = "";
	private String tweatCommentCount = "";
	
	public void setUserName(String username)
	{
		this.userName = username;
	}
	public void setUserPhoto(String userphoto)
	{
		this.userPhoto = userphoto;
	}
	public void setTweatString(String tweatString)
	{
		this.tweatString = tweatString;
	}
	public void setTweatPhoto(String tweatPhoto)
	{
		this.tweatPhoto = tweatPhoto;
	}
	public void setTweatTime(String TweatTime)
	{
		this.tweatTime = TweatTime;
	}
	public void setTweatLikes(String TweatLikes)
	{
		this.tweatLikesCount = TweatLikes;
	}
	public void setTweatComments(String tweatComments)
	{
		this.tweatCommentCount = tweatComments;
	}
	
	public String getUserName()
	{
		 return this.userName;
	}
	public String getUserPhoto()
	{
		return this.userPhoto;
	}
	public String getTweatString()
	{
		return this.tweatString;
	}
	public String getTweatPhoto()
	{
		return this.tweatPhoto;
	}
	public String getTweatTime()
	{
		return this.tweatTime;
	}
	public String getTweatLikes()
	{
		return this.tweatLikesCount ;
	}
	public String getTweatComments()
	{
		return this.tweatCommentCount;
	}

}
