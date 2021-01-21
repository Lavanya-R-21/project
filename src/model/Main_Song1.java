package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main_Song1 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of songs:");
		int n=sc.nextInt();
		List<Artist> artistList = Artist.prefill();
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
			String title=arr[0];
			String genre=arr[1];
			SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
			Date duration=sdf.parse(arr[2]);
			Double rating=Double.valueOf(arr[3]);
			Song song=new Song(title, genre, duration, rating, new ArrayList<Artist>());
			String[] nameArr = arr[4].split("-");	
			//			arr[4] contains "Ed Sheeran-Steve Mac"
		
			for(String aName:nameArr)
			{
				//using name, find the artist from the prefill
				for(Artist artist:artistList)
				{
					if(artist.getName().equals(aName))
					{
						//found an artist. add this artist to the artist collection of Song object
						song.getArtistList().add(artist);
						artist.getSongList().add(song);
						break;
					}
				}
			}
			
		}
		System.out.println("Enter the date for special collection");
		String dateStr=sc.next();
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf1.parse(dateStr);
		List<Song> result = Song.specialCollection(artistList, date);
		System.out.format("%-20s %-20s %s\n","Title","Genre","Rating");
		for(Song s: result)
		{
			System.out.format("%-20s %-20s %s\n",s.getTitle(),s.getGenre(),s.getRating());
		}
	}

}
