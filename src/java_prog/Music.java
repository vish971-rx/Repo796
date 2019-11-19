package java_prog;

public class Music {
	private String title,artist,album;
	private float duration;
	Music()
	{
		title="";
		artist="";
		album="";
		duration=0.0f;
	}
	Music(String title,String artist,String album,float duration)
	{
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.duration=duration;
		
	}
	public void play()
	{
		System.out.println("Music is playing..");
	}
	public void pause()
	{
		System.out.println("Music is paused..");
		
	}
	public void shuffle()
	{
		System.out.println("Shuffled song..");
	}
	public void replay()
	{
		System.out.println("Replaying song..");
	}
	public void display()
	{
System.out.println(title);
System.out.println(album);
System.out.println(artist);
System.out.println(duration);
}}

