package frame;

public class Sept25 {
	 public static void main(String[] args){
	  Song s1 = new Song(1978,"스웨덴","DancingQueen","ABBA");
	 
	     s1.show();
	 
	 }
	  
	}
	class Song{
	 String title,artist;
	 int year;
	 String country;
	 public Song(int year, String country, String title, String artist){
	  this.year = year;
	  this.country = country;
	  this.title = title;
	  this.artist = artist;
	 }
	 
	 public void show(){
	  System.out.println(this.year+"년 " + this.country +" 국적의 "+ this.artist+"가 부른 "+this.title );
	  
	 }
	}