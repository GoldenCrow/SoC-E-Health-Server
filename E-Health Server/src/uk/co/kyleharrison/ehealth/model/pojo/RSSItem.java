package uk.co.kyleharrison.ehealth.model.pojo;

import java.net.URL;
import java.util.Date;

public class RSSItem extends RSSBase {
	
	private String UID;
	private Date creaionDate;
	private String title;
	private URL link;
	private Date pubDate;
	private String creator;
	private String catergory;
	private String description;
	private URL comments;
	private String contentEncoded;
	private int slashComments;
	
	public RSSItem() {
		super();
	}

	public RSSItem(String title, URL link, URL comments,
			Date pubDate, String creator, String catergory,
			String description, String contentEncoded, int slashComments) {
		this.title = title;
		this.link = link;
		this.setComments(comments);
		this.pubDate = pubDate;
		this.creator = creator;
		this.catergory = catergory;
		this.description = description;
		this.setContentEncoded(contentEncoded);
		this.setSlashComments(slashComments);
	}

	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public Date getCreaionDate() {
		return creaionDate;
	}

	public void setCreaionDate(Date creaionDate) {
		this.creaionDate = creaionDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public URL getLink() {
		return link;
	}

	public void setLink(URL link) {
		this.link = link;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCatergory() {
		return catergory;
	}

	public void setCatergory(String catergory) {
		this.catergory = catergory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public URL getComments() {
		return comments;
	}

	public void setComments(URL comments) {
		this.comments = comments;
	}

	public String getContentEncoded() {
		return contentEncoded;
	}

	public void setContentEncoded(String contentEncoded) {
		this.contentEncoded = contentEncoded;
	}

	public int getSlashComments() {
		return slashComments;
	}

	public void setSlashComments(int slashComments) {
		this.slashComments = slashComments;
	}

	
}
