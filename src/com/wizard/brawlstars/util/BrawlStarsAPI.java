package com.wizard.brawlstars.util;

import java.net.URL;
import java.security.PublicKey;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;
import com.wizard.brawlstars.entity.BrawlStarsPlayer;

public class BrawlStarsAPI {
	public static final Gson GSON = new Gson();
	private String token;
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public BrawlStars(String token) {
		this.token = token;
	}
	
	public BrawlStarsPlayer getPlayerInfo(String tag) {
		return GSON.fromJson(request(tag), BrawlStarsPlayer.class);
	}
	
	private String request(String url) {
		HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();
	}
}
