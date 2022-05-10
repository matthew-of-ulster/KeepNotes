import java.util.ArrayList;

public class Note {
	
	private ArrayList<Attachment> attachments;
	private String color;
	private boolean trashed;
	private boolean pinned;
	private boolean archived;
	private String textContent;
	private String title;
	private long lastEdit;
	private long created;
	
	
	
	public Note(String input) {
		super();
		String[] details=input.split("color");
		ArrayList<Attachment> attachments = new ArrayList<>();
		if(!details[0].equals("{\"")) {
			details[0]=details[0].substring(16,details[0].length());
			String[] attArray=details[0].split("filePath\":\"");
			
			for(int i=1;i<attArray.length;i++) {
				String[] attSplit = attArray[i].split("\",\"mimetype\":\"");
				attSplit[1] = attSplit[1].substring(0,attSplit[1].length()-5);
				attachments.add(new Attachment(attSplit[0],attSplit[1]));
			}
		}
		
		this.attachments = attachments;
		
		String[] trashed = details[1].split("\",\"isTrashed\":");
		color = trashed[0].substring(3,trashed[1].length());
		
		String[] pinned = trashed[1].split(",\"isPinned\":");
		this.trashed =Boolean.parseBoolean(pinned[1].substring(3,trashed[1].length()));
		
		System.out.println(input);
		System.out.println(pinned[1]);
		
		
		//{"color":"BROWN","isTrashed":false,"isPinned":false,"isArchived":false,"textContent":"Action\n-alert\n-nalert\n-accept\n-naccept\n-com\n-ncom\n\nStatus\n-na\n-def\n-ndef\n-auth\n-nauth\n-healthy\n-nhealthy\n\nMasurement\n-na\n-PR\n-RR\n-DA\n-IR\n-DR\n\n","title":"All outputs from simulator","userEditedTimestampUsec":1616694948530000,"createdTimestampUsec":1616694189610000}
		//{"attachments":[{"filePath":"1602069434133.1616977036.png","mimetype":"image/png"},{"filePath":"1602510952097.1274930171.png","mimetype":"image/png"},{"filePath":"1602510952143.1456014143.png","mimetype":"image/png"},{"filePath":"1602510952162.1696188400.png","mimetype":"image/png"},{"filePath":"1602510952180.1645012644.png","mimetype":"image/png"},{"filePath":"1602510952196.553106512.png","mimetype":"image/png"}],"color":"BLUE","isTrashed":false,"isPinned":false,"isArchived":false,"annotations":[{"description":"Ing-Ray Chen. Professor. Ing-Ray Chen Department of Computer Science Virginia Polytechnic Institute and State University 7054 Haycock Road Falls Church, VA 22043. Tel: (703) 538-8376. Fax: (703) 538-8348. Email: irchen at cs.vt.edu. - Biography; - Teaching Schedule; - Professional Activities; - ...","source":"WEBLINK","title":"Home Page of Ing-Ray Chen","url":"http://people.cs.vt.edu/~irchen/"}],"textContent":"My project is to ensure that the rules derived for resembling the systems to identify vulnerabilities and threats in M-iot are correct.\n\n This project focuses on developing formal methods and then writing a state\nmachine which can help to ensure that the behaviour rules derived for detection of misbehaviour, or anomalies, or a general workflow are correct. \n\nThe system should be scalable to not only M-IoT but also to other devices that are driven by rules-based approaches.\n\nhttp://people.cs.vt.edu/~irchen/\n\n","title":"My project summed up","userEditedTimestampUsec":1602510952738000,"createdTimestampUsec":1602068796834000}

	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isTrashed() {
		return trashed;
	}
	public void setTrashed(boolean trashed) {
		this.trashed = trashed;
	}
	public boolean isPinned() {
		return pinned;
	}
	public void setPinned(boolean pinned) {
		this.pinned = pinned;
	}
	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	public String getTextContent() {
		return textContent;
	}
	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getLastEdit() {
		return lastEdit;
	}
	public void setLastEdit(long lastEdit) {
		this.lastEdit = lastEdit;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	
	

}
