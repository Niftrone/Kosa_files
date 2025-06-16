package com.kosa.service;

import com.kosa.vo.Movie;

public class MovieMgr {
	private Movie[] movies = new Movie[100];
	private int index = 0;

	private static MovieMgr mgr = new MovieMgr();

	private MovieMgr() {
	}

	public static MovieMgr getInstance() {
		return mgr;
	}

	public void add(Movie m) {
		if (index < movies.length) {
			movies[index++] = m;
			System.out.println(m.getTitle() + " 영화 추가");
		} else {
			System.out.println("공간이 모자릅니다.");
		}
	}

	public Movie[] search() {
	    Movie[] movie = new Movie[index];
	    for (int i = 0; i < index; i++) {
	        movie[i] = movies[i];
	    }
	    return movie;
	}

	public Movie[] search(String keyword, String type) {
	    if (keyword == null || type == null) {
	        return new Movie[0];
	    }

	    int count = 0;
	    for (Movie m : movies) {
	        if (matches(m, type, keyword)) {
	            count++;
	        }
	    }

	    Movie[] result = new Movie[count];
	    int idx = 0;
	    for (Movie m : movies) {
	        if (matches(m, type, keyword)) {
	            result[idx++] = m;
	        }
	    }

	    return result;
	}

	public void delete(String title) {
		for(int i = 0; index > i ; i++) {
			if(movies[i] != null && movies[i].getTitle().equals(title)) {
				for(int j = i; index > j; j++) {
					movies[j] = movies[j + 1];
				}
				movies[index - 1] = null;
				index--;
				System.out.println(title + " 삭제 완료");
				return;
			}
		}
		System.out.println("삭제할 영화가 없습니다.");
	}

	public int getSize() {
		return index;
	}
	
	private boolean matches(Movie m, String type, String keyword) {
	    if (m == null || type == null || keyword == null) {
	    	return false;
	    }

	    switch (type.toLowerCase()) {
        case "genre":
            return keyword.equals(m.getGenre());
        case "title":
            return keyword.equals(m.getTitle());
         case "director": 
        	return keyword.equals(m.getDirector()); // 나중에 추가할 수도 있음
        default:
            return false;
	    }
	}
}
